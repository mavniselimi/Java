/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paket2;

/**
 *
 * @author pc
 */
public class PAket2 implements IPAket2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void toplama(int a, int b) {
        System.out.println("Toplam==>"+(a+b));
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("Çıkarma==>"+(a-b));
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("Çarpma==>"+(a*b));    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bölme==>"+((double)(a/b)));
    }
    
}
