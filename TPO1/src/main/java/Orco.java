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
    private final Object mutex;
    
    public Orco(String nombre, Vida vidaPJ, Object Mutex){
        super(nombre);
        vidaPersonaje = vidaPJ; //recurso compartido
        mutex = Mutex;
    }
    
    private void golpear(){
        this.vidaPersonaje.setPuntosVida(this.vidaPersonaje.getPuntosVida() - 3);
    } //metodo para golpear al personaje
    
    public void run(){
        for(int i = 1; i <= 10; i++){
            synchronized(mutex){ //sincronizo la parte del código que ingresa a la seccion critica (los puntos de vida)
                this.golpear();
                System.out.println(Thread.currentThread().getName() + " golpeó al personaje, sus puntos de vida actuales son: "
                + vidaPersonaje.getPuntosVida());
            }
            try{
                Thread.sleep((int) Math.random() * 10);
            }catch(InterruptedException e){}
        }
    }
}
