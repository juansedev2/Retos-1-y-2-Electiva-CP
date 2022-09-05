import java.util.Scanner;

public class TestOperacionesCadena {
    

    private final OperacionesCadena unaCadena;

    public TestOperacionesCadena() {

        this.unaCadena= new OperacionesCadena();

    }

    public void leerCadena (String cadena){

        unaCadena.setCadena (cadena);

        System.out.println("\nLa Longitud de la cadena: " + unaCadena.obtenerLongitudCadena ()+" caracteres ");

        System.out.println("\nLa cadena texto en mayusculas: " + unaCadena.convertirMayusculas());

        System.out.println("La cadena texto en minusculas: " + unaCadena.convertirMinusculas ());

        unaCadena.imprimirCaracteresCadena();

    }

    public static void main(String[] args) {
        

        TestOperacionesCadena prueba = new TestOperacionesCadena(); 
        String cadena="";

        //se lee la cadeena por teclado 
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite Cadena ");

        cadena= sc.nextLine();

        prueba.leerCadena (cadena);

    }

}