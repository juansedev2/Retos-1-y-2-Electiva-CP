/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadorpalabras;


/**
 *
 * @author Juan Sebastian
 */
public class GeneradorPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*s
        * NOTA: Cada clase es la solución a los puntos del taller de palabras, así que revisar el directorio
          de docs, cada título del documento tendrá el nombre de la clase correspondiente
        */
        // Solución punto 3
        System.out.println("Solución punto 3: ");
        Punto3 punto_3 = new Punto3();
        System.out.println("La palabra es: ");
        System.out.println(punto_3.getPalabra());
        // Solución punto 4
        System.out.println("Solución punto 4: ");
        Punto4 punto_4 = new Punto4();
        System.out.println("La palabra es: ");
        System.out.println(punto_4.getPalabra());
        System.out.println("La conversión a decimal es: ");
        System.out.println(punto_4.getDecimal());
         // Solución punto 5
        System.out.println("Solución punto 5: ");
        Punto5 punto_5 = new Punto5();
        System.out.println("La clave es: ");
        System.out.println(punto_5.getClave());
    }
    
}
