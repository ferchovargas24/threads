/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-
 */
import java.util.*;
public class TareaReloj extends Thread{

    @Override
    public void run() {
        int i = 0;
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
    
}
