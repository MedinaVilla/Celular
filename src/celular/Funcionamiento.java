package celular;

/**
 * Programa que permite obtener los datos del celular ingresado
 * @author Medina Villalpando Josué de Jesús
 * @version 1.0
* @since 03/09/17
 */
public class Funcionamiento {

    String bateria;
    String marca;
    /** Sobre carga del metodo para obtener la batería del celular
     * 
     * @param bateria Recibe la cantidad de bateria que contiene el celular
     */
    public Funcionamiento(int bateria){
        this.bateria = String.valueOf(bateria);
    }
    /**
     * Sobre carga del metodo para obtener la marca celular
     * @param marca Recibe la marca del celular
     */
    public Funcionamiento(String marca){
        this.marca = marca;
    }
    
    
}
