
package tablamultipicar;
/*Tabla de multiplicar usando for.*/

public class TablaMultipicar {

    
    public static void main(String[] args) {
        System.out.println("Tabla de Multiplicar de 1 a 10");
        System.out.println("------------------------------");
        
        for (int i = 1; i < 11; i++) {
            System.out.println("-----------");
            System.out.println("Tabla de "+ i );
            
            
            for (int j = 1; j < 11; j++) {
                int resultado = i * j;
                System.out.println(i + " x "+ j + " = " + resultado);
                
            }
            
        }
        
    }
    
}
