
package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Holmes
 */
public class ViajeIndividual extends Viaje {

    public ViajeIndividual() {
    }
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
    super( origen,  destino,  costo,  fechaSalida,  fechaLlegada);
   
    }

  

    
    @Override 
    public String Descripcion(){
        return "Disfruta tu viaje individual";
    };
}
