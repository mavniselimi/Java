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
public class Stack {
    public static void main(String[] args) {
        birincipartyazilim(args);
    }
    public static void ucuncupartyazilim() {
        try {
            int a=12/0;
            
        } catch (ArithmeticException e) {
            System.out.println("Bir sayı sıfıra bölünemez");
        }
        
    }
    public static void ikincipartyazilim(String[] args) {
        ucuncupartyazilim();
    }
    public static void birincipartyazilim(String[] args) {
        ikincipartyazilim(args);
    }
}
