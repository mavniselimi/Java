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
public class ArmstrongSayisi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int ar=0,basamak,a=scanner.nextInt(),gecicisayi;
        gecicisayi=a;
        while(gecicisayi>0){
            basamak=gecicisayi%10;
            ar+=basamak*basamak*basamak;
            gecicisayi=gecicisayi/10;
        }
        if (ar==a){
            System.out.println("Girdiğiniz sayı bir armstrong sayısı");
        }
        else{
            System.err.println("Girdiğiniz Sayı Armstrong Sayısı Değildir!!!!");
        }
    }
}
