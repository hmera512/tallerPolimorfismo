

package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Holmes
 */
public  abstract class Viaje {
    
    protected String origen;    
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;

    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }
    
    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    
    //metodos 
    public abstract String Descripcion();
    
    public String CualquierMetodo(){
        return "cualquier metodo implementado en la clase base";
    }
    
    public String CualquierMetodo2(){
        return "cualquier metodo2 implementado en la clase base";
    }

}
