
package galoneslitros;
/*Conversión de Galones a Litros
En este proyecto, crearemos un programa que convierta galones a litros. litros en un galón. Así, para convertir galones a
litros, el valor del galón se multiplica por 3.7854. El programa muestra tanto el número de galones como el número 
equivalente de litros.
El programa funcionará declarando dos variables dobles. Una contendrá el número de galones, y la segunda contendrá el número
de litros después de la conversión. Hay 3.7854 
*/

public class GalonesLitros {

    public static void main(String[] args) {
        double galones;
        double litros;
        
        galones = 10;
        
        litros = galones * 3.7854;
        
        System.out.println(galones + " galones es  "+ litros + " litros");
    }
    
}
