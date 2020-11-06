/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gastón
 */
public class Curandero extends Thread{
    //Clase que se va a encargar de simular al Curandero
    
    private final Vida vidaPersonaje;
    
    public Curandero(String nombre, Vida vidaPJ){
        super(nombre);
        vidaPersonaje = vidaPJ; //recurso compartido
    }
    
    public void curar(){
        this.vidaPersonaje.setPuntosVida(this.vidaPersonaje.getPuntosVida() + 3);
    }
    public void run(){
        this.curar();
        System.out.println(Thread.currentThread().getName() + " curó al personaje, sus puntos de vida actuales son: "
        + vidaPersonaje.getPuntosVida());
    }
}
