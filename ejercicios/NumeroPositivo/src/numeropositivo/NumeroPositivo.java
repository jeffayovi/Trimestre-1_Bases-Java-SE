

package numeropositivo;

import java.util.Scanner;


public class NumeroPositivo {
/*Programa que clasifique números (positivo/negativo) con if.
    
  Fase 1: Compresion
    Entrada: numero entero
    Salaida: mensaje numero positivo o numero negativo 
    Caso de Prueba: 
    numero = 5: numero positivo
    numero = -5: numero negativo
    numero = 0 : numero neutro 
    
  Fase 2: Planificacion
    1 obtener un numero
    2 comparar si numero es mayor 0 
    3 mostrar el mensaje numero positivo
    4 comparar si numero es menor 0
    5 mostrar un mensaje es negativo
    6 si numero es 0 mostrar numero es neutro*/
    
    public static void main(String[] args) {
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa un numero: ");
        numero = entrada.nextInt();
        
        if (numero > 0) {
            System.out.println(numero + " es positivo");
            
        }
        if (numero < 0) {
            System.out.println(numero + " es negativo");
            
        }
        if (numero == 0) {
            System.out.println(numero + " es neutro");
        }
        entrada.close();
    }
    
}
