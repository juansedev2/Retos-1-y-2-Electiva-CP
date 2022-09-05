import java.util.Scanner;

public class TestProcesoCadena {

    public static void main(String[] args) { 
        ProcesoCadena app = new ProcesoCadena();

        String cad1 = ""; 
        String cad2="";

        Scanner sc = new Scanner(System.in);         

        System.out.print("Digite la Cadena1: ");

        cad1=sc.nextLine();

        System.out.print("Digite la Cadena2: ");

        cad2=sc.nextLine();
        System.out.println(app.obtenerCompareTo(cad1,cad2));

        if(!app.obtenerComparacion (cad1,cad2)) {

            System.out.println("Las cadenas son desiguales. ");

        }
    }
}