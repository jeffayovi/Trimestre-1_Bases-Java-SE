package calculadorasimple;

import java.util.Scanner;

public class CalculadoraSimple {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora Simple");

        double numero1, numero2;

        System.out.println("Ingrese el primer numero: ");
        numero1 = entrada.nextDouble();

        System.out.println("Ingresa el segundo numero: ");
        numero2 = entrada.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        int modulo = (int) numero1 % (int) numero2;

        System.out.println("Resultado de la suma: " + suma);
        System.out.println("Resultado de la resta: " + resta);
        System.out.println("Resultado de modulo: " + modulo);
    }

}
