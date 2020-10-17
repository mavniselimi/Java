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
public class Metodlar {
    public static void FaktoriyelHesapla(int a) {
        int b=1;
        for (int i = 1; i < a; i++) {
            b*=i;
        }
        System.out.println(a+" sayısının faktöriyeli==>"+b);
    }
    public static void main(String[] args) {
        System.out.println("Abdülkadir");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Faktöriyeli Hesaplanacak sayısı giriniz==>");
        int g=scanner.nextInt();
        FaktoriyelHesapla(g);
        System.out.println(üssü(10,2));
    }
    public static int üssü(int a,int b) {
        int sonuc=1;
        for (int i = 0; i < b; i++) {
            sonuc*=a;
        }
        return sonuc;
    }
}
