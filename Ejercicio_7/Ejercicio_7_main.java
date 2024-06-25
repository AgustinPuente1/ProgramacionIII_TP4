package Ejercicio_7;

import java.util.Stack;

public class Ejercicio_7_main {

    public static void main(String[] args) {
        String cadena = "Hola yo soy Agustin P. Justo";

        Stack<String> pila = new Stack<>();

        for (String letra : cadena.split("")) {
            pila.push(letra);
        }

        String cadenaAlreves = "";
        for (int i = 0; i < cadena.length(); i++) {
            cadenaAlreves += pila.pop();
        }

        System.out.println();
        System.out.println(cadenaAlreves);
    }
}
