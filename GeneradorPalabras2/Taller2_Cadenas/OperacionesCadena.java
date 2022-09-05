public class OperacionesCadena {
    /**
    • atributo de la clases
     **/
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
    Método que retorna el tamaño o longitud de la cadena * @return tamaño cadena
     **/

    public int obtenerLongitudCadena( ){
        return cadena.length();

    } 

    /**

     * Método que convierte y retorna la cadena en mayúsculas * @return cadena en mayúsculas

     **/

    public String convertirMayusculas() {
        return cadena.toUpperCase();

    }

    /**
    Método que convierte y retorna la cadena en minúsculas

    @return cadena en minúsculas
     **/
    public String convertirMinusculas() { 
        return cadena.toLowerCase();
    }

    /**
    Método que imprime los caracteres que conforma la cadena
     **/
    public void imprimirCaracteresCadena( ){
        char c=' ';
        System.out.println("\nImpresion de la Cadena por caracteres");
        for (int i=0;i<cadena.length();i++){
            c=cadena.charAt(i); 
            System.out.println(i+" "+c);
        }

        System.out.println(" ");
}
}