package Testing;

import java.util.LinkedList;
import java.util.Queue;

public class TestColas {
    public static void main(String[] args) {

        Queue<Integer> cola = new LinkedList<>();

        cola.add(1);
        cola.add(2);
        cola.add(3);

        System.out.println(cola);
        System.out.println(cola.peek());
        System.out.println(cola.remove());
        System.out.println(cola.peek());
        System.out.println(cola);

        cola.add(4);

        System.out.println(cola);
        System.out.println(cola.remove());
        System.out.println(cola);
        System.out.println(cola.peek());
        System.out.println(cola.poll());
        System.out.println(cola);
    }
}
