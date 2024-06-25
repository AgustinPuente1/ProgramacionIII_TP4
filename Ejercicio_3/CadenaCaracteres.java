package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadenaCaracteres {
    //1. Determinar si una cadena de caracteres está presente en un una lista de cadenas.
    private List<String> cadenaCaracteres;

    public CadenaCaracteres() {
        this.cadenaCaracteres = new ArrayList<>(List.of("Uno","Dos","Tres","Cuatro","Cinco",
                "Seis","Siete","Ocho","Nueve","Diez"));
    }

    public void menu(){
        boolean parar = false;
        Scanner scanner = new Scanner(System.in);
        while (!parar){
            
            System.out.println("---Menu del punto 1 del Ejercicio 3---");
            System.out.println("1. Mostar lista de caracteres.");
            System.out.println("2. Encontrar string.");
            
            int indice;
            String indiceStr;
            indiceStr = scanner.nextLine();
            try {
                indice = Integer.parseInt(indiceStr);
                if (indice == 1){
                    mostrarLista(0);
                } else if (indice == 2){
                    System.out.println("Ingrese un String para buscar");
                    String cadena = scanner.nextLine();
                    encontrarString(cadena, 0);
                } else {
                    System.out.println("Saliendo del menu del punto 1.");
                    scanner.close();
                    return;
                }
            } catch (Exception e) {
                parar = false;
            }
        }
        scanner.close();
        return;
    }

    public int mostrarLista(int indice){
        if (indice >= cadenaCaracteres.size()){
            System.out.println("---------------");
            System.out.println("Fin de la lista");
            System.out.println("---------------");
            return -1;
        }

        System.out.println(cadenaCaracteres.get(indice));
        return mostrarLista(indice + 1);
    }

    public int encontrarString(String cadena, int indice){
        if (indice >= cadenaCaracteres.size()){
            System.out.println("---------------");
            System.out.println("No se encontro esa palabra en la lista");
            System.out.println("---------------");
            return -1;
        }

        if (cadenaCaracteres.get(indice).toUpperCase().equals(cadena.toUpperCase())){
            System.out.println("---------------");
            System.out.println("SE ENCONTRO LA PALABRA EN LA LISTA, TIENE DE INDICE " + indice);
            System.out.println("---------------");
            return 1;
        }

        return encontrarString(cadena, indice + 1);
    }
}
