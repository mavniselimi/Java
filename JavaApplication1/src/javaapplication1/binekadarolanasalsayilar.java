/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author pc
 */
public class binekadarolanasalsayilar {
    public static void main(String[] args) {
        //İyi forumlar
        //
        //
        //
        //
        /*
        Selam
        */
        for (int i = 2; i < 1000; i++) {
            boolean b=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    b=false;
                }
            }
            if (b){
                System.out.println(i+" sayısı bir asal sayıdır");
            }
            
        }
    }
}
