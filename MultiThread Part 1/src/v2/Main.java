/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v2;

/**
 *
 * @author pc
 */
public class Main {
    public int count=0;
    
    public void threadleriCalistir(){
    
    }
    public static void main(String[] args) {
        Thread pThread=new Thread(new Printer("Abdülkadir"));
        Thread pThread2=new Thread(new Printer("Efe"));
        pThread.start();
        pThread2.start();
        Main main=new Main();
        main.threadleriCalistir();
    }
}
