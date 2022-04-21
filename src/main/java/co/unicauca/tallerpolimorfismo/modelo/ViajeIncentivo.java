/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Holmes
 */
public class ViajeIncentivo extends Viaje {

    public ViajeIncentivo(String empresa) {
        this.empresa = empresa;
    }
 
    private String empresa;
    
    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada,String empresa) {
    super( origen,  destino,  costo,  fechaSalida,  fechaLlegada);
    this.empresa = empresa;
    }




    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
        
   
    
    @Override
    public String Descripcion(){
        return "Viaje incentivo que te envia la empresa " + empresa;

    };
    @Override
    public String CualquierMetodo2() {
    return "Método implementado en la clase hija viaje familiar";
    }
}
