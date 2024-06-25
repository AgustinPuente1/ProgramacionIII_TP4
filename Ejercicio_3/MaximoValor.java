package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximoValor {
    //4. Determinar el máximo de una lista de valores.
    private List<Integer> listaValores;

    public MaximoValor(){
        this.listaValores = new ArrayList<>();
        generarListaNum();
    }

    public void generarListaNum(){
        int numero;
        for (int i = 0; i < 10; i++){
            numero = (int) (Math.random() * 20) + 1;
            this.listaValores.add(numero);
        }
    }

    public void menu(){
        boolean parar = false;
        Scanner scanner = new Scanner(System.in);
        while (!parar){
            
            System.out.println("---Menu del punto 4 del Ejercicio 3---");
            System.out.println("1. Mostrar lista de numeros auto generados.");
            System.out.println("2. Sacar el mayor de la lista.");
            System.out.println("3. Generar 10 listas, las muestra y verifica cual es el mayor en cada una.");

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
                        sacarMayorValor(0, 0);
                        break;
                    case 3:
                        diezListas(0);
                        break;
                    default:
                        System.out.println("Saliendo del menu del punto 4.");
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
        if (indice >= listaValores.size()){
            System.out.println("---------------");
            System.out.println("Fin de la lista");
            System.out.println("---------------");
            return -1;
        }

        System.out.println(listaValores.get(indice));
        return mostrarLista(indice + 1);
    }

    public int sacarMayorValor(int indice, int mayor){
        if (indice >= listaValores.size()){
            System.out.println("-------------------------------");
            System.out.println("El mayor numero de la lista es " + mayor);
            System.out.println("-------------------------------");
            return 1;
        }

        if (listaValores.get(indice) > mayor){
            mayor = listaValores.get(indice);
        }
        
        return sacarMayorValor(indice + 1,mayor);
    }

    public int diezListas(int indice){
        if (indice >= 10){
            return 1;
        }
        this.listaValores.clear();
        generarListaNum();
        mostrarLista(0);
        sacarMayorValor(0, 0);

        return diezListas(indice + 1);
    }
}
