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
    Vida vidaPersonaje;
    
    public Orco(String nombre, Vida vidaPJ){
        super(nombre);
        vidaPersonaje = vidaPJ; //recurso compartido
    }
    
    public void run(){
        vidaPersonaje.golpear();
        System.out.println(Thread.currentThread().getName() + " golpeó al personaje, sus puntos de vida actuales son: "
        + vidaPersonaje.getPuntosVida());
    }
}
