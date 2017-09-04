package celular;

/**
 * Programa que permite obtener los datos del celular ingresado
 * @author Medina Villalpando Josué de Jesús
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
