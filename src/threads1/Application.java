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
public class Application {
    
    public static void main(String[] args) {
        //Ciclo de vida del thread
        
        //Nace
        PrimerThread t1 = new PrimerThread();
        OtraTarea t2 = new OtraTarea();
        //Lo ponemos en estado iniciado: estado Runnable
        t1.start();
        t2.start();
        //El soguiente paso es meterlo a la cpu(esto lo hace el administrador de thread)
        
    }
}
