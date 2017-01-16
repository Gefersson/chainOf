/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author juan
 */
public interface Imanejador {
      public void peticion(String descripcion, int tiempoDeEspera);
    public Imanejador getSucesor();
    public void setSucesor(Imanejador sucesor);
    
}
