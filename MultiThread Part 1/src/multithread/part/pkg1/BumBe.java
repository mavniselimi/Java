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
public class BumBe {
    public int count=0;
    public synchronized void arttir(){
        count++;
    }
    public void threadleriCalistir(){
       Thread thread=new Thread((new Runnable() {
           @Override
           public  void run() {
               for (int i = 0; i < 5000; i++) {
                   arttir();
               }
           }
       }));
       Thread thread2=new Thread((new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 5000; i++) {
                  arttir();
               }
           }
       }));
       thread.start();
       thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(BumBe.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Count değişkeninin değeri==>"+count);
    }
    public static void main(String[] args) {
        /*Thread pThread=new Thread(new v2.Printer("Abdülkadir"));
        Thread pThread2=new Thread(new v2.Printer("Efe"));
        pThread.start();
        pThread2.start();*/
        BumBe main=new BumBe();
        main.threadleriCalistir();
    }
}
