package Ejercicio_1;


public class Factorial {
    public static int factorial(int numero){
        int resultado = 1;
        for (int i = numero; i >= 1; i--){
            resultado = resultado * i;
        }
        return resultado;
    }

    public static boolean chequearNumero(int numero) throws NumeroMayorA12Exception, NumeroNoPositivoException{
        if (numero > 12){
            throw new NumeroMayorA12Exception("El numero es mayor a 12");
        } else if (numero < 1){
            throw new NumeroNoPositivoException("El numero no es positivo");
        }
        return true;
    }
}
