public class Main {
    public static void main(String[] args) {
        Queuearray s = new Queuearray(4);
        System.out.println(s.isFull());
        System.out.println(s.isEmpty());
        s.enQueue(23);
        s.enQueue(343);
        s.enQueue(34);
        s.enQueue(34);
        s.enQueue(343);
        int result = s.deQueue();
        System.out.println(result);
        s.deleteQueue();
        try {
            System.out.println(s.isEmpty());
        }catch(NullPointerException e){
            System.out.println("The Queue is empty");
        }
    }
}
