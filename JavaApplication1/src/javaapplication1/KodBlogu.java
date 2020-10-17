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
public class KodBlogu {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Çarpım Tab losunu Görmek İstermisiniz Evet İçin 1 Hayır için Sıfır=========>");
        int f = scanner.nextInt();
        if (f==1) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i+"x"+j+"="+i*j);
                }
            }
        }
        else if (f==0) {
            System.out.println("Niye Sıfır Girdin?");
        }
        else{
            for (int i = 0; i < 10; i++) {
                System.err.println("********************************************");
                System.err.println("HATA");
                System.err.println("Lütfen Geçerli Bir sayı Giriniz");
                System.err.println("********************************************");
                
            }
        }
    }
}
