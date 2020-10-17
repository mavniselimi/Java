/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class VucutKitleEndeksi {
    public static void main(String[] args) {
       double a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Boyunuz Metre cinisnden giriniz");
        a=scanner.nextDouble();
        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz");
        b=scanner.nextDouble();
        if (b/(a*a)<18.75) {
            System.out.println("Zayıfsınız");
        }
        else if(b/(a*a)<24.99){
            System.out.println("Normal kilosunuz");
        }
        else if(b/(a*a)<30.00){
            System.out.println("Biraz fazlanız var sanki?");
        }
        else if(b/(a*a)>30.00){
            System.err.println("Obezsiniz Acilen Doktora gidiniz");
        }
        else{
            System.err.println("HATA");
        }
    }
}
