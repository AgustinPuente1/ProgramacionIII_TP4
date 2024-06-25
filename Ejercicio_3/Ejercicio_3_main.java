package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3_main {
    public static void main(String[] args) {
        
        // EN TODOS LOS EJERCICIOS LAS LISTAS ESTAN AUTOGENERADAS

        String menudeadorStr;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Menu Ejercicio 3---");
        System.out.println("1. Cadena de caracteres.");
        System.out.println("2. Cantidad de numero impares.");
        System.out.println("3. Lista de enteros crecientes.");
        System.out.println("4. Maximo de lista de valores.");

        menudeadorStr = scanner.nextLine();

        try {
            int menudeador = Integer.parseInt(menudeadorStr);
            if (menudeador == 1){
                CadenaCaracteres cadenaCaracteres = new CadenaCaracteres();
                cadenaCaracteres.menu();
            } else if (menudeador == 2){
                NumerosImpares numerosImpares = new NumerosImpares();
                numerosImpares.menu();
            } else if (menudeador == 3){
                EnterosCreciente enterosCreciente = new EnterosCreciente();
                enterosCreciente.menu();
            } else if (menudeador == 4){
                MaximoValor maximoValor = new MaximoValor();
                maximoValor.menu();
            } 
            } catch (Exception e) {
                System.out.println("El valor no coincide con ningun menu");
                System.out.println("Saliendo del programa");
            }
        scanner.close();
        
    }
}
