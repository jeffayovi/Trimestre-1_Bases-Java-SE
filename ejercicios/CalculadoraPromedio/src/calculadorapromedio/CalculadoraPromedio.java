
package calculadorapromedio;

import java.util.Scanner;


public class CalculadoraPromedio {

    
    public static void main(String[] args) {
        int nota1 = 0,nota2 = 0,nota3 = 0,nota4 = 0;
        final int NOTA_MINIMA = 0;
        final int NOTA_MAXIMA = 100;// Ajustar según el sistema de notas
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar Nota 1 :  ");
        nota1 = entrada.nextInt();
        System.out.println("Ingresar Nota 2 :  ");
        nota2 = entrada.nextInt();
        System.out.println("Ingresar Nota 3 :  ");
        nota3 = entrada.nextInt();
        System.out.println("Ingresar Nota 4 :  ");
        nota4 = entrada.nextInt();
        
        if (nota1 < NOTA_MINIMA || nota1 > NOTA_MAXIMA ||
            nota2 < NOTA_MINIMA || nota2 > NOTA_MAXIMA ||
            nota3 < NOTA_MINIMA || nota3 > NOTA_MAXIMA ||
            nota4 < NOTA_MINIMA || nota4 > NOTA_MAXIMA ) {
            
            System.out.println("Error: Las notas deben estar entre "+ NOTA_MINIMA + " Y "+ NOTA_MAXIMA);
            return;
            
        }
        
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4.0;
        
        System.out.println("El promedio de cuatro notas es "+promedio);
        
        entrada.close();
    }
    
}
