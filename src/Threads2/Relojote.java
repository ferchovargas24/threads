/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads2;

import java.util.Calendar;

/**
 *
 * @author T-
 * Aqui se usara el polimorfismo, esta clase es polimorfica
 */
public class Relojote implements Runnable, CompportamientoComer {
    
    public static void main(String[] args) {
        //probemos que no podemos crear objetos de las interfaces
        //CompportamientoComer cp = new CompportamientoComer();
        //Aqui se crea el thread POLIFORMICAMENTE
        
        Runnable r = new Relojote();
        Thread t1 = new Thread(r);
        t1.start();
    }

    @Override
    public void run() {
        
        while(true){
            Calendar cal = Calendar.getInstance();
            
            //Aqui vamos a activar varias propiedades relacionadas a los calendarios
            //hora minuto segundo
            int hora = cal.get(Calendar.HOUR_OF_DAY);
            int minuto = cal.get(Calendar.MINUTE);
            int segundo = cal.get(Calendar.SECOND);
            System.out.println("La hora es "+hora+ ":" +minuto+ ":" +segundo);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                
            }
        }
    }

    @Override
    public String obtenerHabitoAlimenticio() {
        return "Soy reloj y no como";
    }
}
