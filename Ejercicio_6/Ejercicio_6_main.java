package Ejercicio_6;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio_6_main {
    public static void main(String[] args) {
        String orarion = "Hola yo soy agustin y estoy escribiendo esto";

        String[] palabras = orarion.split(" ");

        Queue<String> palabrasQueue = new LinkedList<>();

        for (String palabra : palabras) {
            palabrasQueue.add(palabra);
        }

        boolean iguales = false;
        String palabraBuscar;
        for (int i = 0; i < palabrasQueue.size(); i++) {
            palabraBuscar = palabrasQueue.poll();
            for (String palabra : palabrasQueue) {
                if (palabra.equals(palabraBuscar)) {
                    iguales = true;
                    break;
                }
            }
            if (iguales) {
                System.out.println("La primer palabra repetida es: "+ palabraBuscar);
                break;
            }
        }

        System.out.println(iguales);
    }
}
