/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınner.pkgclass.non.pkgstatic;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class MatematikV2 {
    private double PI=Math.PI;
    public static class Factorial{
        public void faktorial(){
            Scanner scanner=new Scanner(System.in);
            System.out.print("Bir Sayi Giriniz==>");
            int sayi=scanner.nextInt();
            double fact=1;
            for (int i = 2; i <=sayi; i++) {
                fact*=i;
            }
            System.out.println("\nFaktoriyel==>"+fact);
        }
    
    }
    public static class Asal{
        public boolean asalmi(int sayi){
            boolean t=true;
            for (int i = 2; i < sayi; i++) {
                if (sayi%i==0) {
                    t=false;
                }
            }
            return t;
        }
        
    }
    public static class Alan{
        public void dairealan(int yaricap){
            System.out.println("Dairenin Alani==>"+(yaricap*yaricap*Math.PI));
        }
    }
}
