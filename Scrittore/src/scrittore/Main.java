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
public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int SCRITTORI = 3;
        final int LETTORI = 3;
        Lettore[] lettori = new Lettore[LETTORI];
        Scrittore[] scrittori = new Scrittore[SCRITTORI];

        for(int i = 0; i < LETTORI; i++){
            lettori[i] = new Lettore();
            Thread.sleep(100);
            lettori[i].start();
        }

        for(int i = 0; i < SCRITTORI; i++){
            scrittori[i] = new Scrittore(lettori);
            scrittori[i].start();
        }
        Thread.sleep(10000);

        for(int i = 0; i < SCRITTORI; i++){
            scrittori[i].interrupt();
        }

        for(int i = 0; i < LETTORI; i++){
            lettori[i].interrupt();
        }

        Thread.sleep(1000);
        System.out.println("Finito");
    }
}
