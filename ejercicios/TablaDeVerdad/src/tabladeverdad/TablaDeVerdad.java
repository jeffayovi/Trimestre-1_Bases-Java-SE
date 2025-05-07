
package tabladeverdad;
//Try This 2-2:una tabla de verdad para los operadores lógicos (utilizando 1 y 0)

public class TablaDeVerdad {

    
    public static void main(String[] args) {
        boolean p, q;
        
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        
        p = true; q = true;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p&q) + "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q) + "\t" + boolToInt(!p));
        
        p = true; q = false;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p&q) + "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q) + "\t" + boolToInt(!p));
        
        p = false; q = true;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p&q) + "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q) + "\t" + boolToInt(!p));
        
        p = false; q = false;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p&q) + "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q) + "\t" + boolToInt(!p));
        
    }

    // Método para convertir boolean a int (1 o 0)
    public static int boolToInt(boolean b) {
        return b ? 1 : 0;
    }
    
}
