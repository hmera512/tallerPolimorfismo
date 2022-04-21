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
public class ViajeFamiliar extends Viaje {

    private int integrantesFamilia;

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada,int integrantesFamilia) {
        super( origen,  destino,  costo,  fechaSalida,  fechaLlegada);
        this.integrantesFamilia = integrantesFamilia;
    }

    
    


    public int getIntegrantesFamilia() {
        return integrantesFamilia;
    }

    public void setIntegrantesFamilia(int integrantesFamilia) {
        this.integrantesFamilia = integrantesFamilia;
    }
    @Override 
    public String Descripcion(){
        return "Viaje para disfrutar con toda tu familia";
    };
    @Override
    public String CualquierMetodo2() {
    return "Método implementado en la clase hija viaje familiar";
    }

    
}
