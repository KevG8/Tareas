package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingresa tu radio");
        int radio = sp.nextInt();
        int longitud = (int) (2*Math.PI*radio);
        int area = (int) (Math.PI * (radio*radio));
        
        System.out.println("La longitud es: "+longitud);
        System.out.println("}El radio es: "+area);
    }
    
}