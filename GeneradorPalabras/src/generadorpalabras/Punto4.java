/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorpalabras;

/**
 *
 * @author Juan Sebastian
 * GUÍA DE AYUDA DEL ALGORITOMO BINARIO -> DECIMAL: https://www.youtube.com/watch?v=CUr74ebGWT8
 * Básicamente, como se traba en sistema base 2, se debe reversar la cadena, obteniendo los números de derecha a izquierda
 * y luego por cada uno hacer el producto entre el número y la base constante 2 elevado a la potencia cero, incrementándose
 * esta por cada número.
 * El resultado final es la suma de los productos.
 */
public class Punto4 {

    // Atributos de la clase
    protected static char[] alfabeto = {'0', '1'};
    private String palabra;
    private int decimal; // Número decimal de la palabra

    // Constructor de la clase
    public Punto4() {
        this.generarPalabra();
    }

    // Get y set
    public static char[] getAlfabeto() {
        return alfabeto;
    }

    public static void setAlfabeto(char[] alfabeto) {
        Punto4.alfabeto = alfabeto;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    // Método para generar la palabra
    private void generarPalabra() {

        // Obtener la longitud aleatoria de la palabra
        // Primera definimos una longitud arbitraria
        int longitud = obtenerLongitud();
        String palabra = "";
        // Llenamos la palabra de caracteres
        for (int i = 0; i < longitud; i++) {
            // Número aleatorio del 1 al 27 según el alfabeto latino
            int posicion_letra = (int) Math.floor(Math.random() * Punto4.alfabeto.length);
            char letra = Punto4.alfabeto[posicion_letra];
            palabra += String.valueOf(letra);
        }
        this.palabra = palabra;
        // Luego vamos a convetirla en decimal
        this.decimal = this.calcularDecimal(palabra);
    }

    // Método para calcular la equivalencia de una palabra en decimal
    private int calcularDecimal(String cadena) {
        String reversa = this.regresarCadena(palabra);
        int num_decimal = 0;
        int exponente = 0;
        for(int i = 0; i < reversa.length(); i++){
            int numero = Integer.parseInt(String.valueOf(reversa.charAt(i)));  // Obtener dígito de cada palabra
            double resultado = Math.pow(2, exponente);  // Elevar la base constante al exponente
            int producto = numero * (int) resultado;  // Realizar el producto entre la base y el dígito
            num_decimal += producto;  // Realizar sumatoria de cada producto
            exponente++;
        }
        return num_decimal;
    }

    // Método para poner en revesa la palabra
    private String regresarCadena(String palabra) {
        String aux = "";
        // System.out.println("La cadena original es: " + palabra);
        for (int i = this.palabra.length() - 1 ; i >= 0; i--) {
            aux += palabra.charAt(i);
        }
        //System.out.println("Darle reversa a la palabra dió este resultado " + aux);
        return aux;
    }

    // Función para obtener la longitud de la cadena
    private int obtenerLongitud() {
        // Primera definimos una longitud arbitraria
        int min = 1;
        int max = 5;
        // Fórmula general para obtener números en un rango determinado con 
        int longitud = (int) Math.floor(Math.random() * (max - min + 1) + min);  // longitud será el tamaño de la palabra
        System.out.println("Tamaño de la palabra : " + longitud);
        return longitud;
    }

}
