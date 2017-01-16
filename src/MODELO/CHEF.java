/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class CHEF implements Imanejador{
       private Imanejador sucesor;
    @Override
    public void peticion(String descripcion, int tiempoDeEspera) {
        if (tiempoDeEspera > 20 && tiempoDeEspera <= 40){
            JOptionPane.showMessageDialog(null, "La peticion: "+descripcion+"esta siendo atendido por el chef");
        }else{
            sucesor.peticion(descripcion, tiempoDeEspera);
        }
    }

    @Override
    public Imanejador getSucesor() {
        return sucesor;
    }

    @Override
    public void setSucesor(Imanejador sucesor) {
       this.sucesor = sucesor;
    
}
    
}
