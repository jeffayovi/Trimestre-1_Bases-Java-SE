
package areatriangulo;

import java.util.Scanner;

/*
Calcular el área de un triángulo (usar double para precisión).

Fase 1: Comprecion
Entrada: base y altura
Salida: area
Caso de Prueba:
base = 12 y altura = 15 : El area deberia ser 90

Fase 2: Planificacion
1. obtener el valor de Base
2. obtener el valor de altura
3. multiplicar base y altura 
4. dividir el resultado anterior en 2
5. mostrar el resultado de area
*/


public class AreaTriangulo {

    
    public static void main(String[] args) {
        int base,altura;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar el valor de Base: ");
        base = entrada.nextInt();
        System.out.println("Ingresa el valor de Altura: ");
        altura = entrada.nextInt();
        
        double area = (base * altura) / 2.0;
        
        System.out.println("El Area de un Triangulo es "+area);
    }
    
}
