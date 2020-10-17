/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread.part.pkg1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Printer extends Thread{
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim+" Çalışıyor"); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(isim+" Yazıyor"+i);
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                System.out.println("Thread Kesintiye Uğradı");
            }
        }
        System.out.println("Halloldu"); 
    }
    
}
