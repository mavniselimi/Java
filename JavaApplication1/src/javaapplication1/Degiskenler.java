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
public class Degiskenler {
    public static void main(String[] args) {
        byte o = 110;
        System.err.println(Byte.MAX_VALUE);
        System.err.println("HATA");
        int a;
        a=90;
        double aOp=1.52;
        System.err.println("A="+a);
        System.err.println(Integer.MAX_VALUE);
        System.err.println(Integer.MIN_VALUE);
        System.err.println(Long.MAX_VALUE);
        String aas="Merhaba";
        System.err.println(aas+" Abdülkadir");
        System.err.println("3"+"1"+" "+29+2);
        ++a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı Giriniz===>");
        int yas=scanner.nextInt();
        System.err.println("Yaşınız==>"+yas);
    }
}
