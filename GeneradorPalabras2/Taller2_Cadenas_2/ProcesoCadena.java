public class ProcesoCadena {

    public char obtenerCaracter(String cad1, int posicion){ 
        char caracter=cad1.charAt(posicion);
        return caracter; 
    } 

    public String obtenerCompareTo(String cadena1, String cadena2){

        int res = cadena1.compareTo(cadena2); // Compara cadena 1 con cadena 2
        String respuesta="";
        System.out.println("valor res"+res);

        if (res==0){
            respuesta="Las cadenas son iguales";
        }else if (res>0){//cuando res es un número positivo cadena 1 es mayor 
            respuesta="La cadena mayor es "+cadena1;            
        }else{//cuando res es un número negativo cadena 2 es mayor
            respuesta="La cadena mayor es "+cadena2;                 
        }
        return respuesta;   
    }

    public boolean obtenerComparacion(String cadena1, String cadena2){

        if (cadena1.equals(cadena2)){

            return true;

        } else{

            return false;
        }
    }
}