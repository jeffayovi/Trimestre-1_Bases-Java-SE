
package pesoluna;

import java.util.Scanner;
/*
La gravedad de la Luna es aproximadamente el 17 % de la de la Tierra. Escribe un programa que calcule tu peso efectivo en 
la Luna.

*/

public class PesoLuna {

    
    public static void main(String[] args) {
        int peso;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el tu peso: ");
        peso = entrada.nextInt();
        
        if (peso < 0) {
            System.out.println("Error: El peso debe se numero positivo");
            return;
        }
        // La gravedad lunar es el 17% de la terrestre, por lo que el peso será el 17%
        double pesoLuna = peso * 0.17;
        
        System.out.println("Tu peso en la Luna es "+pesoLuna);
    }
    
}
