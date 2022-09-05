/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorpalabras;

import java.util.Random;

/**
 *
 * @author Juan Sebastian
 */
public class Punto3 {

    // Construir un programa que permita generar palabras que tengan por lo menos dos a.
    // Atributo estático que contiene el alfabeto
    protected static char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ',
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    // Atributo de la clase
    private String palabra;

    // Constructor
    public Punto3() {
        this.generarPalabra();
    }

    // Get
    public String getPalabra() {
        return palabra;
    }

    // Función para obtener la palabra aleatoria
    private void generarPalabra() {
        // Obtener la longitud aleatoria de la palabra
        // Primera definimos una longitud arbitraria
        int longitud = obtenerLongitud();
        String palabra = "";

        // Teniendo la longitud, luego creamos la palabra        
        while (!validarPalabra(palabra)) {

            palabra = "";
            // Llenamos la palabra de caracteres
            for (int i = 0; i < longitud; i++) {
                // Número aleatorio del 1 al 27 según el alfabeto latino
                int posicion_letra = (int) Math.floor(Math.random() *  Punto3.alfabeto.length);
                char letra = Punto3.alfabeto[posicion_letra];
                palabra += String.valueOf(letra);
            }
        }
        
        this.palabra = palabra;
    }

    // Función para validar la palabra
    private boolean validarPalabra(String palabra) {
        boolean bandera;
        if (palabra.length() == 0) {
            bandera = false;
        } else {

            int contador = 0;  // Contador para validar cuantas 'a' hay en la palabra

            // Recorremos cada caracter de la palabra para validar si contiene 'a'
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == 'a') {
                    contador++;
                }
            }
            if (contador >= 2) {
                bandera = true;
            } else {
                bandera = false;
            }

        }
        return bandera;
    }

    // Función para obtener la longitud de la cadena
    private int obtenerLongitud() {
        // Primera definimos una longitud arbitraria
        int min = 2;
        int max = 10;
        // Fórmula general para obtener números en un rango determinado con 
        int longitud = (int) Math.floor(Math.random() * (max - min + 1) + min);  // longitud será el tamaño de la palabra
        System.out.println("Tamaño de la palabra : " + longitud);
        return longitud;
    }

}
