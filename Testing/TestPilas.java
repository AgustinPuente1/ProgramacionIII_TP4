package Testing;

import java.util.Stack;

public class TestPilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        
        pila.push(1);
        pila.push(2);
        pila.push(3);
        
        System.out.println();
        System.out.println();
        System.out.println(pila.pop());
        System.out.println(pila.peek());
        System.out.println(pila.isEmpty());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }
}
