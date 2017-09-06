
package celular;

import java.util.Scanner;
/**
* Programa que permite mediante constructores, obtener datos del celular
 * @author Medina Villalpando Josue de Jesus 
 * @version 1.0
 * @since 03/09/17
 */
public class Celular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        try{
        System.out.println("Ingrese la batería cargada del celular");
       
       Funcionamiento func = new Funcionamiento(scan.nextInt());
       
     
        System.out.println("Su celular tiene " + func.bateria + "% de bateria");
        
        System.out.println("Ingrese la marca de su celular");
        Funcionamiento func2 = new Funcionamiento(scan.next());
        System.out.println("Su celular es un " + func2.marca);
        }
        catch(Exception e){
            System.out.println("Ingrese un dato valido");
    }
    

    }
}
