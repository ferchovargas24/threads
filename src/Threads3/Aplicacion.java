/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads3;

import java.util.Calendar;

/**
 *
 * @author T-
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        //Paso 1
        //A este tipo de threads se les llama background threads
         Thread t1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 while(true){
                     try{
                         Calendar cal = Calendar.getInstance();
                         int hora =  cal.get(Calendar.HOUR_OF_DAY);
                         int minuto = cal.get(Calendar.MINUTE);
                         int segundo = cal.get(Calendar.SECOND);
                         System.out.println(""+hora+":"+minuto+":"+segundo);
                         Thread.sleep(1000);
                     }catch(Exception e){
                         
                     }
                 }
             }//termina el metodo run
           }
         );
         t1.start();
    }
}
