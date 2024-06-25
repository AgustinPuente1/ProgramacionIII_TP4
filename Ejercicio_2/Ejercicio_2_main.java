package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2_main {
    public static void main(String[] args) {
        ListaNumeros listaNumeros = new ListaNumeros();
        Scanner scanner = new Scanner(System.in);

        boolean parar = false;
        while (!parar){
            System.out.println("Lista de numero auto generados");
            System.out.println("1. Mostrar.");
            System.out.println("2. Mostrar por indice.");
            System.out.println("3. Agregar.");
            System.out.println("4. Deletear por indice.");

            int menudeador = scanner.nextInt();
            int indice;

            if (menudeador == 1){
                listaNumeros.mostrar();
            } else if (menudeador == 2){
                System.out.println("Ingresar un indice");
                indice = scanner.nextInt();
                try {
                    listaNumeros.mostrarNum(indice);
                } catch (NumeroFueraDeIndiceException e) {
                    System.out.println("Ingresaste un indice equivocado");
                }
            } else if (menudeador == 3){
                System.out.println("Ingrese un numero que sera agregado a la lista");
                int numero = scanner.nextInt();
                listaNumeros.agregarNum(numero);
            } else if (menudeador == 4){
                System.out.println("Ingresar un indice");
                    indice = scanner.nextInt();
                    try {
                        listaNumeros.deletearNum(indice);
                    } catch (NumeroFueraDeIndiceException e) {
                        System.out.println("Ingresaste un indice equivocado");
                    }
            } else {
                parar = true;
            }
        }
        scanner.close();
        
    }
}
