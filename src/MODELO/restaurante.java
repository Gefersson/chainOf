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
public class restaurante implements Imanejador{
        private Imanejador sucesor;
    @Override
    public void peticion(String descripcion, int tiempoDeEspera) {
       
        mesero mesero = new mesero();
        setSucesor(mesero);
        
        CHEF chef = new CHEF();
        
        aDMINISTRADOR admini = new aDMINISTRADOR();
        chef.setSucesor(admini);
            sucesor.peticion(descripcion, tiempoDeEspera);
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
