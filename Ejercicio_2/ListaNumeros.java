package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    private List<Integer> listaAutogenerada;

    public ListaNumeros() {
        this.listaAutogenerada = new ArrayList<>();
        generarListaNum();
    }

    public void generarListaNum(){
        int numero;
        for (int i = 0; i < 5; i++){
            numero = (int) (Math.random() * 1000000) + 1;
            this.listaAutogenerada.add(numero);
        }
    }

    public void agregarNum(int numero){
        this.listaAutogenerada.add(numero);
    }

    public int tamanio(){
        return listaAutogenerada.size();
    }

    public void mostrar(){
        for (Integer num : listaAutogenerada) {
            System.out.println(num);
        }
    }

    public void deletearNum(int numero) throws NumeroFueraDeIndiceException{
        if (numero < 0 || numero >= tamanio()){
            throw new NumeroFueraDeIndiceException();
        } else {
            this.listaAutogenerada.remove(numero);
        }
    }

    public void mostrarNum(int numero) throws NumeroFueraDeIndiceException{
        if (numero < 0 || numero >= tamanio()){
            throw new NumeroFueraDeIndiceException();
        } else {
            System.out.println(listaAutogenerada.get(numero));
        }
    }
}
