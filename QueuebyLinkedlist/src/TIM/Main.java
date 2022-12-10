package TIM;

public class Main {
    public static void main(String[] args) {
        Queuelinkedlist s = new Queuelinkedlist();
        s.enQueue(1);
        s.enQueue(2);
        s.enQueue(3);
        s.traverse();
        s.deQueue();
        System.out.println();
        s.traverse();
        s.deQueue();
        System.out.println();
        s.traverse();
        s.deQueue();
        s.deQueue();
    }

}
