/*
Programa que convierta grados Celsius a Fahrenheit (usar casting si es necesario).
*/
package conversortemperatura;

import java.util.Scanner;


public class ConversorTemperatura {

    
    public static void main(String[] args) {
        // Crear objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese la temperatura en Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Calcular Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Mostrar resultado con decimales
        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
        
        // Versión con casting a int (sin decimales)
        int fahrenheitEntero = (int)fahrenheit;
        System.out.println("En valores enteros: " + celsius + "°C ≈ " + fahrenheitEntero + "°F");
        
        // Cerrar el scanner
        scanner.close();
    }
    
}
