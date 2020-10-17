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
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1,2 veya 3 sayısnıdan hangisi==>");
        int sayi=scanner.nextInt();
        switch(sayi){
            case 1:
                System.out.println("Selamun Aleykum ");
                break;
            case 2:
                System.out.println("Aleykum Selam");
                break;
            case 3:
                System.out.println("Maaşallah");
                break;
            default:
                System.err.println("1,2 veya 3 sayısından birini gireceksin bu nasıl bu kadar zor olabilir?");
                break;
        }
    }
}
