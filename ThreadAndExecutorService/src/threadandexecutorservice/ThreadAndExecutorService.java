/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadandexecutorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class ThreadAndExecutorService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService es=Executors.newFixedThreadPool(2);
        for (int i = 0; i <=5; i++) {
            es.submit(new Worker(String.valueOf(i),i,i));
        }
        es.shutdown();
        try {
            es.awaitTermination(1, TimeUnit.DAYS);
            
            /*Thread t1=new Thread(new Worker("Efe", 59, 2));
            Thread t2=new Thread(new Worker("Burak", 99, 6));
            Thread t3=new Thread(new Worker("Eren", 26, 5));
            Thread t4=new Thread(new Worker("Yasin", 64, 7));
            System.out.println("Bütün İşler Teslim Edildi");
            t1.start();
            t2.start();
            try {
            t1.join();
            t2.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(ThreadAndExecutorService.class.getName()).log(Level.SEVERE, null, ex);
            }
            t3.start();
            t4.start();
            try {
            t3.join();
            t4.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(ThreadAndExecutorService.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Bütün İşler Bitti");*/
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadAndExecutorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
///*
/**/
//*//*/**/
/**/
/**/
/*
/*

*/
/*
//
/*

*/