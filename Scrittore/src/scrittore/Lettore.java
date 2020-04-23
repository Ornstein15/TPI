/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrittore;

/**
 *
 * @author matte
 */
class Lettore extends Thread{
    private static int StaticId = 0;
    private int id;

    public Lettore(){
        id = StaticId;
        StaticId++;
    }

    public void getText(int id, String message){
        System.out.println("Lettore " + this.id + " ha ricevuto un messaggio dallo scrittore " + id + " con scritto: " +  message);
    }


}
