/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekokhesapla;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class EkokHesapla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("İlk Sayıyı giriniz==>");double a=s.nextDouble();System.out.println("İkinci sayıyı giriniz==>");double b=s.nextDouble();double c=0;
        if (a<b) {
            for (int i = 0; i <= a; i++) {
                if (a%i==0 && b%i==0) {
                    c=i;
                }
            }
        }
        else if(a>b){
            for (int i = 0; i <= b; i++) {
                if (a%i==0 && b%i==0) {
                    c=i;
                }
            }
        }
        else if(a==b){
            c=a;
        }
        System.out.println(a+" ve "+b+" sayılarının ekoku==>"+((a*b)/c));
    }
    
}
