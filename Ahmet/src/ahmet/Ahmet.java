/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahmet;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ahmet {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Yaricap Giriniz==>");
        int g=s.nextInt();
        System.out.println("Dairenin alanı==>"+(Math.PI*g*g));
    }   
}
