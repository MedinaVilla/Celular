package celular;

/**
 * Programa que permite obtener los datos del celular ingresado
 * @author Medina Villalpando Josué de Jesús
 * @version 1.0.0
 * @date 03/09/17
 * @param bateria Recibe la cantidad de batería que contiene el celular
 * @param marca Recibe la marca del celular
 */
public class Funcionamiento {

    String bateria;
    String marca;
    /** Sobre carga del metodo para obtener la batería y la marca del celular
     * 
     * @param bateria 
     */
    public Funcionamiento(int bateria){
        this.bateria = String.valueOf(bateria);
    }
    
    public Funcionamiento(String marca){
        this.marca = marca;
    }
    
    
}
