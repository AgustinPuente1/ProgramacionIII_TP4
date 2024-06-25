package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosImpares {
    //2. Contar la cantidad de números impares de una lista.
    private List<Integer> listaNumeros;

    public NumerosImpares(){
        this.listaNumeros = new ArrayList<>();
        generarListaNum();
    }

    public void generarListaNum(){
        int numero;
        for (int i = 0; i < 50; i++){
            numero = (int) (Math.random() * 1000000) + 1;
            this.listaNumeros.add(numero);
        }
    }

    public void menu(){
        boolean parar = false;
        Scanner scanner = new Scanner(System.in);
        while (!parar){
            
            System.out.println("---Menu del punto 2 del Ejercicio 3---");
            System.out.println("1. Mostar lista de numeros auto generados aleatoriamente.");
            System.out.println("2. Contar cantidad de impares.");
            System.out.println("3. Generar 10 listas, las muestra y verifica cuantos impares tiene cada uno.");

            int indice;
            String indiceStr;
            indiceStr = scanner.nextLine();
            try {
                indice = Integer.parseInt(indiceStr);
                switch (indice) {
                    case 1:
                        mostrarLista(0);
                        break;
                    case 2:
                        contarImpares(0,0);
                        break;
                    case 3:
                        diezListas(0);
                        break;
                    default:
                        System.out.println("Saliendo del menu del punto 2.");
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
        if (indice >= listaNumeros.size()){
            System.out.println("---------------");
            System.out.println("Fin de la lista");
            System.out.println("---------------");
            return -1;
        }

        System.out.println(listaNumeros.get(indice));
        return mostrarLista(indice + 1);
    }

    public int contarImpares(int indice, int cantImpares){
        if (indice >= listaNumeros.size()){
            System.out.println("-----------------------------------------------");
            System.out.println("La cantidad de numeros impares en la lista son " + cantImpares);
            System.out.println("-----------------------------------------------");
            return cantImpares;
        }

        if (listaNumeros.get(indice) % 2 == 1){
            cantImpares += 1;
        } 
        
        return contarImpares(indice + 1, cantImpares);
    }

    public int diezListas(int indice){
        if (indice >= 10){
            return 1;
        }
        this.listaNumeros.clear();
        generarListaNum();
        mostrarLista(0);
        contarImpares(0, 0);

        return diezListas(indice + 1);
    }
}
