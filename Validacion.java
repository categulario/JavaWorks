/*
*Clase para pruebas de validacion y cosas de esas.
*
*
*/
import java.io.*;

public class Validacion{
    public static void main(String args[]){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //Los anteriores son solo un par de objetos para obtener la entrada
        
        System.out.println("Hola");
        boolean allOk = true; //Recordemos el camelcase de Java
        String f="";
        int num = 0; //Aqui vamos a guardar el numero
        try{
            f = br.readLine();
            num = Integer.parseInt(f); //Tratamos de convertir el numero en cuestion
        } catch(IOException e){
            //Atrapamos un error con la entrada
            System.out.println("Error en la entrada");
            allOk = false;
        } catch(NumberFormatException e){
            System.out.println("Esto no parece un numero");
        }
        if(allOk){
            System.out.println(f);
        }
    }
}
