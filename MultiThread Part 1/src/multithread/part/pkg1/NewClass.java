/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread.part.pkg1;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class NewClass {
    Random random=new Random();
    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();
    private Object lock1=new Object();
    private Object lock2=new Object();
    public void listDegerEkle() {
        synchronized(lock1){
        try {
            Thread.sleep(1);
            list.add(random.nextInt(100));
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    public void listDegerEkle2() {
        synchronized (lock2){
        try {
            Thread.sleep(1);
            list2.add(random.nextInt(100));
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }
    public void degerata(){
        for (int i = 0; i < 1000; i++) {
            
            listDegerEkle();
            listDegerEkle2();
        }
    }
    public void calis(){
    Thread thread=new Thread(new Runnable() {
        @Override
        public void run() {
            degerata();
        }
    });
    Thread thread2=new Thread(new Runnable() {
        @Override
        public void run() {
            degerata();
        }
    });
        long baslangic=System.currentTimeMillis();
    thread.start();
    thread2.start();
        try {
            thread.join();
    thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("List size1:"+list.size()+" List size 2: "+list2.size()); 
        long bitis=System.currentTimeMillis();
        System.out.println("Geçen Süre==>"+(bitis-baslangic));
}
}
