
package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Holmes
 */
public class ViajeTodoIncluido extends Viaje {

    public ViajeTodoIncluido() {
    }
    public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
    super( origen,  destino,  costo,  fechaSalida,  fechaLlegada);
   
    }




    
 @Override
 public String Descripcion() {
 return "Disfruta tu viaje todo incluido";
 };
 
}
