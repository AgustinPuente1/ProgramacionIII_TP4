package Ejercicio_8;

import java.util.Stack;

public class Ejercicio_8_main {
    public static void main(String[] args) {
        String cadena = "(a+b)(c+d)";

        Stack<String> pila = new Stack<>();

        for (String letra : cadena.split("")) {
            pila.push(letra);
        }

        int parentesis1 = 0;
        int parentesis2 = 0;

        for (int i = 0; i < cadena.length(); i++) {
            String last = pila.pop();
            if (last.equals("(")) {
                parentesis1++;
            } else if (last.equals(")")) {
                parentesis2++;
            }
        }

        System.out.println();
        System.out.println(parentesis1 == parentesis2);
    }
}
