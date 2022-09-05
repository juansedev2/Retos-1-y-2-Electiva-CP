/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorpalabras;

/**
 *
 * @author Juan Sebastian
 */
public class Punto5 {

    // Atributos de la clase
    private String clave;

    // Constructor de la clase
    public Punto5() {
        this.generarClave();
    }

    // Get y set
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    // Función para generar la clave
    private void generarClave() {

        // Primera definimos la longitud del requerimiento para la clave
        int longitud = 7;

        // Obtener decisión para definir si se asigna un caracter o un número
        boolean decision = obtenerDecision();
        String palabra = "";
        boolean total_mayus = true;  // Contador para que sepamos si ya hay mayúsculas, el primer caracter debe ser en mayúscula

        // Llenamos la palabra de caracteres
        for (int i = 0; i < longitud; i++) {

            if (decision) {  // Caso de usar una letra

                // Número aleatorio del 1 al 27 según el alfabeto latino
                int posicion_letra = (int) Math.floor(Math.random() * Punto3.alfabeto.length);
                char letra = Punto3.alfabeto[posicion_letra];
                String aux_letra = String.valueOf(letra);

                if (total_mayus) {
                    aux_letra = aux_letra.toUpperCase();
                    total_mayus = false;
                }
                
                palabra += aux_letra;
                
            } else {  // Caso de usar un número
                
                int digito = obtenerDigitoNatural();
                String aux = String.valueOf(digito);
                palabra += aux;
            }
            
            decision = obtenerDecision();  // Actualizamos la decision
        }

        this.clave = palabra;
    }
    // Función para obtener la longitud de la cadena
    private int obtenerDigitoNatural() {
        // Primera definimos una longitud arbitraria
        int min = 0;
        int max = 9;
        // Fórmula general para obtener números en un rango determinado con 
        int num_natural = (int) Math.floor(Math.random() * (max - min + 1) + min);  // longitud será el tamaño de la palabra
        return num_natural;
    }

    // Función para obtener la longitud de la cadena
    private boolean obtenerDecision() {
        // Primera definimos una longitud arbitraria
        int min = 1;
        int max = 2;
        // Fórmula general para obtener números en un rango determinado con 
        int num_natural = (int) Math.floor(Math.random() * (max - min + 1) + min);  // longitud será el tamaño de la palabra
        return num_natural == 1 ? true : false;
    }

}
