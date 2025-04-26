
package convertirpulgadasmetros;
/*
Adapte "Pruebe esto 1-2" para que imprima una tabla de conversión de pulgadas a metros. Muestre 12 pies de conversiones, 
pulgada por pulgada. Imprima una línea en blanco cada 12 pulgadas. (Un metro equivale aproximadamente a 39,37 pulgadas).
*/
public class ConvertirPulgadasMetros {

   
    public static void main(String[] args) {
        final double PULGADA_POR_METRO = 39.37;
        
        System.out.println("Tabla de conversion de pulgadas a metros");
        System.out.println("Pulgadas\tMetros");
        System.out.println("----------------------------------------");
        
        for (int pulgadas = 1; pulgadas < 145; pulgadas++) {
            
            //12 pies = 144 pulgadas (12 pies * 12 pulgadas/pie)
            double metros = pulgadas / PULGADA_POR_METRO;
            System.out.println( pulgadas + "       "+ metros);
            
            // Imprimir línea en blanco cada 12 pulgadas
            if (pulgadas % 12 == 0) {
               System.out.println();
            }
            
        }
       
        
       
    }
    
}
