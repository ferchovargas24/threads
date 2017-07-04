/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-
 * esta es la primera forma que es la mas facil y consiste en heredar la clase 
 * Thread
 */
/*Paso 1 heredamos la clase thread*/
public class PrimerThread extends Thread{
    
    //Paso 2: Sobreescribimos el metodo run
    @Override
    public void run(){
        System.out.println("Soy un thread que no hace nada");
    }
}
