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
import java.util.Random;

public class Scrittore extends Thread{

    private static int StaticNum = 0;
    private int num;
    private static Lettore[] readers;

    public Scrittore(Lettore[] l){
        num = StaticNum;
        StaticNum++;
        readers = l;
    }

    @Override
    public void run(){
        Random random = new Random();
        try {
            while(true){
                Thread.sleep(1000);
                readers[random.nextInt(readers.length)].getText(num, "Ciao");
            }
        } catch (InterruptedException e) {
            System.out.println("Scrittore " + num + " interrotto");
        }
    }
}
