/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gastón
 */
public class Orco extends Thread{
    //clase Thread que se va a encargar de simular al orco
    private final Vida vidaPersonaje;
    
    public Orco(String nombre, Vida vidaPJ){
        super(nombre);
        vidaPersonaje = vidaPJ; //recurso compartido
    }
    
    public void golpear(){
        this.vidaPersonaje.setPuntosVida(this.vidaPersonaje.getPuntosVida() - 3);
    }
    
    public void run(){
        this.golpear();
        System.out.println(Thread.currentThread().getName() + " golpeó al personaje, sus puntos de vida actuales son: "
        + vidaPersonaje.getPuntosVida());
    }
}
