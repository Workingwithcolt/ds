public class Main {
    public static void main(String[] args) {
        CircularQueue s = new CircularQueue(3);
        System.out.println(s.isEmpty());
        System.out.println();
        System.out.println(s.isFull());
        s.enQueue(1);
        s.enQueue(2);
        s.enQueue(3);
        int result = s.deQueue();
        System.out.println(result);
    }
}
