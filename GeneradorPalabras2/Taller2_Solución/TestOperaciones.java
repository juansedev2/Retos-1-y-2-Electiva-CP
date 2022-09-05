import java.util.Scanner;
public class TestOperaciones
{
    private final OperacionesCadena unaCadena;
    public TestOperaciones() {

        this.unaCadena= new OperacionesCadena();

    }
    public void leerCadena (String cadena){

        unaCadena.setCadena (cadena);
        System.out.println("\nLa cadena invertida es: " + unaCadena.InvertirCadena());
        System.out.println("\nEl número total de vocales es: " + unaCadena.contarVocales(cadena));
        System.out.println("\nLa cadena es palindroma? " + unaCadena.esPalindromo(cadena));
        


    }
    public static void main(String[] args) {
        

        TestOperaciones prueba = new TestOperaciones(); 
        String cadena="";

        //se lee la cadeena por teclado 
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite Cadena: ");

        cadena= sc.nextLine();

        prueba.leerCadena (cadena);
        
    }
}
