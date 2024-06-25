package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnterosCreciente {
    //3. Determinar si una lista de enteros es creciente.
    private List<Integer> listaEnteros;

    public EnterosCreciente(){
        this.listaEnteros = new ArrayList<>();
        generarListaNum();
    }

    public void generarListaNum(){
        int numero;
        for (int i = 0; i < 4; i++){
            numero = (int) (Math.random() * 20) + 1;
            this.listaEnteros.add(numero);
        }
    }

    public void menu(){
        boolean parar = false;
        Scanner scanner = new Scanner(System.in);
        while (!parar){
            
            System.out.println("---Menu del punto 3 del Ejercicio 3---");
            System.out.println("1. Mostar lista de numeros 5 enteros auto generados aleatoriamente.");
            System.out.println("2. Verificar si la lista de enteros es creciente.");
            System.out.println("3. Generar 10 listas, las muestra y verifica si son crecientes.");

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
                        esCreciente(0, true);
                        break;
                    case 3:
                        diezListas(0);
                        break;
                    default:
                        System.out.println("Saliendo del menu del punto 3.");
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
        if (indice >= listaEnteros.size()){
            System.out.println("---------------");
            System.out.println("Fin de la lista");
            System.out.println("---------------");
            return -1;
        }

        System.out.println(listaEnteros.get(indice));
        return mostrarLista(indice + 1);
    }

    public int esCreciente(int indice, boolean creciente){
        if (((indice + 1) >= listaEnteros.size()) && (creciente == true)){
            System.out.println("------------------------");
            System.out.println("La lista SI es creciente");
            System.out.println("------------------------");
            return 1;
        } else if (creciente == false) {
            System.out.println("------------------------");
            System.out.println("La lista NO es creciente");
            System.out.println("------------------------");
            return -1;
        }

        if (listaEnteros.get(indice) > listaEnteros.get(indice + 1)){
            creciente = false;
        }
        
        return esCreciente(indice + 1,creciente);
    }

    public int diezListas(int indice){
        if (indice >= 10){
            return 1;
        }
        this.listaEnteros.clear();
        generarListaNum();
        mostrarLista(0);
        esCreciente(0, true);

        return diezListas(indice + 1);
    }
}
