/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author pc
 */
public class finalclass {
    public static void main(String[] args) {
        try {
            /*String s=null;
            System.out.println(s.hashCode());*/
            int a=30/0;
        } catch (NullPointerException e) {
            System.out.println("Null refeans Hatası");
        }
        catch(ArithmeticException e){
            System.out.println("Bir Sayı Sıfıra Bölünmez");
        }
        finally{
            System.out.println("Yat Aşağı");
        }
    }
}
