
package galoneslitros;
/*Conversión de Galones a Litros
Puede utilizar el bucle for, la sentencia if y bloques de código para crear una versión mejorada del conversor de galones
a litros que desarrolló en el primer proyecto. 
Esta nueva versión imprimirá una tabla de conversiones, comenzando con 1 galón y terminando en 100 galones.
Después de cada 10 galones, se imprimirá una línea en blanco. Esto se logra mediante el uso de una variable llamada 
contador que cuenta el número de líneas que han sido impresas. Preste especial atención a su uso.

*/

public class GalonesLitros {

    public static void main(String[] args) {
        final double GALONES_A_LITROS = 3.7854;
        int contador = 0;
        
        System.out.println("Tabla de Cenvercion de  Galones a Litros");
        System.out.println("----------------------------------------");
       
        for (double galones = 1; galones < 100; galones++) {
            
            double litros = galones * GALONES_A_LITROS;
            System.out.println(galones + " galones es "+ litros +" litros");
            
            contador++;
            
            //cada 10 linea se imprime una linea negra
            if (contador == 10) {
                System.out.println();
                contador = 0;//reiniciar el contador de linea   
            } 
        }
        
    }
    
}
