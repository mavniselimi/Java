/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author pc
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*try {
            
                String s=null;
            
            int a=s.lenght();
        } catch (Exception NullPointerException) {
            System.out.println("HATA");
        }*/
        
        /*try {
            int a=30/0;
            
        } catch (Exception ZeroDivisionException) {
            System.out.println("Burası ÇAlışıyor");
        }*//**//*/**//*
        try {
            int a=50/0;
        } catch (ArithmeticException e) {
            System.out.println("Bir Sayı 0 a bölğnemez");
        }*/
        
        
    }
    
}
