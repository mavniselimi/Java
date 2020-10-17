/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class throwkey {
    public static void mekankontrol(int yas){
        if (yas<18) {
            throw new InvalidAgeException("Invalid Age");
        }
        else{
            System.out.println("Mekana Hos Geldiniz");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Lütfen Yaşınızı Giriniz==>");
        int yas=s.nextInt();
        //mekankontrol(yas);
        try {
            mekankontrol(yas);
            
        } catch (InvalidAgeException e) {
            System.out.println("Liseli geri bas");
        } catch (java.util.InputMismatchException e){
            System.out.println("Lütfen Sayı Girniz");
        }
    }
}
