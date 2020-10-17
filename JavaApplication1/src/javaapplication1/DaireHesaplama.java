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
public class DaireHesaplama {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen Daire Yarıçapını Giriniz====>");
        int yaricap=scanner.nextInt();
        System.err.println("Dairenin Alanı==>"+yaricap*yaricap*3.14+"       Dairenin Çevresi==>"+yaricap*2*3.14);
    }
}
