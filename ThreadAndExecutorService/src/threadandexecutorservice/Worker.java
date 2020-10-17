/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadandexecutorservice;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Worker implements Runnable{
    private String isim;
    private int id;
    private int workerTaskLevel;

    public Worker(String isim, int id, int workerTaskLevel) {
        this.isim = isim;
        this.id = id;
        this.workerTaskLevel = workerTaskLevel;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("Worker "+isim+" adlı "+id+" numaralı çalışan "+workerTaskLevel+" numaralı "+" işe başladı"); //To change body of generated methods, choose Tools | Templates.
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
         System.err.println("Worker "+isim+" adlı "+id+" numaralı çalışan "+workerTaskLevel+" numaralı "+" işe bitirmedi :("); //To change body of generated methods, choose Tools | Templates.

        }
        System.out.println("Worker "+isim+" adlı "+id+" numaralı çalışan "+workerTaskLevel+" numaralı "+" işi başarıyla bitirdi"); //To change body of generated methods, choose Tools | Templates.

    }
    
}
