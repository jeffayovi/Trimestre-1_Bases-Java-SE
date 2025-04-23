
package areacirculo;

import java.util.Scanner;

/*Calcular área de un círculo

Fase 1: Comprension
Entrada: Radio
Salida: Area 
Caso de Prueba: 
Radio = 0: El área debería ser 0.
Radio = 1: El área debería ser π≈3.14159.
Radio = 5: El área debería ser 25π≈78.54.
Radio = un valor decimal (ej. 2.5): El área debería ser 6.25π≈19.635.

Fase 2: Planificacion
1.Obtener el valor del radio (r).
2.Elevar al cuadrado el valor del radio (r2).
3.Multiplicar el resultado del paso anterior por el valor de π.
4.Mostrar el resultado como el área (A).

*/

public class AreaCirculo {

    
    public static void main(String[] args) {
        double radio,area;
        
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar datos
        System.out.println("Ingresa radio: ");
        radio = entrada.nextDouble();
        
        //Validacion de entrada 
        if (radio <= 0) {
            System.out.println("Error: El radio debe ser un número positivo.");
            return;
            
        }
        
        //Calcular area
        area = Math.PI * Math.pow(radio, 2);
        
        //Mostrar  Mostrar resultado con 2 decimales
        
        System.out.println("Area de un circulo es: "+ area);
        entrada.close();
        
        
        

    }
    
}
