
/**
 * Write a description of class OperacionesCadena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OperacionesCadena
{
    private String cadena;

    /**
    constructor que inicializa la cadena con un espacio en blanco
     **/
    public OperacionesCadena () { 
        this.cadena = "";
    }

    /**
    Constructor que permite crear cadenas @param cadena
     **/
    public OperacionesCadena (String cadena) { 
        this.cadena = cadena;

    }

    /**
    Método que actualiza el contenido de la cadena

    @param cadena
     **/
    public void setCadena (String cadena) {
        this.cadena = cadena;
    }

    /**
    Método que retorna el valor de la cadena. @return cadena
     **/

    public String getCadena() {
        return cadena;
    }

    /**

     * Método que convierte y retorna la cadena invertida 

     **/

    public String InvertirCadena() {
        //convierte String en cadena
        char normal[]=cadena.toCharArray();
        //inicialización de la cadena invertida
        String invert="";
        for(int i=normal.length-1;i>=0;i--){
            //recorre la cadena al revés y guarda por caracter
            invert+=normal[i];
        }
        return invert;
    }

    /**
     * Método que cuenta el total de vocales
     **/
    public static int contarVocales(String cadena){
        //va contando cada vez que se remplaza una vocal de la cadena
        int totalVocales = cadena.replaceAll("[^AEIOUaeiouÁÉÍÓÚáéíóú]","").length();
        return totalVocales;
    }

    /**
     * Metodo que verifica si la palabra se lee igual al leerla al derecho y alrevés
     **/
    public static boolean esPalindromo(String cadena) {
        // Convertir a minúscula y quitar espacios " ", puntos "." y comas ","
        // También remplazar palabras con acento p.ej. í => i

        cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
        .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");

        // Invertir la cadena, y si es igual que la original entonces
        // son palíndromos
        String invertida = new StringBuilder(cadena).reverse().toString();
        // Para invertir recomiendo ver
        // https://parzibyte.me/blog/2019/02/20/invertir-cadena-string-java/
        return invertida.equals(cadena);
    }

}
