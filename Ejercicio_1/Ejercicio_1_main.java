package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1_main{
    public static void main(String[] args) throws NumeroMayorA12Exception, NumeroNoPositivoException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular su factorial (Numeros menores a 12 y positivos): ");
        int numero = scanner.nextInt();
    
        boolean parar = false;
        while (!parar){
            try {
                Factorial.chequearNumero(numero);
                parar = true;
            } catch (NumeroMayorA12Exception e) {
                System.out.println("Error: El numero es mayor a 12, ingrese uno menor: ");
                numero = scanner.nextInt();
            } catch (NumeroNoPositivoException e) {
                System.out.println("Error: El numero es no positivo, ingrese uno mayor: ");
                numero = scanner.nextInt();
            }
        }

        System.out.println("El factorial de " + numero + " es " + Factorial.factorial(numero));
        scanner.close();
    }    
}
