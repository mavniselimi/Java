/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorsandqueues;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author pc
 */
public class Vectors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
        *@param
        */
        Vector<String> vector=new Vector<>();
        ArrayList<String> al=new ArrayList<>();
        vector.add("Java");
        vector.add("C++");
        vector.add("Php");
        /*for (String string : vector) {
            System.out.println(string);
        }
        ListIterator<String> iterator=vector.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }        */
        Enumeration<String> enumeration=vector.elements();
        /*while (enumeration.hasMoreElements()) {
            String nextElement = enumeration.nextElement();
            System.out.println(nextElement);
        }*/
        /*while (enumeration.hasMoreElements()) {
            String next = enumeration.nextElement();
            System.out.println(next);
            
        }*/
        //System.out.println(vector.firstElement()); ilk element
        //System.out.println(vector.lastElement()); son element
        //*/*//*/*/*/*/*/**/*///*/*
        /**//**//**//**/
        Stack<String> stack=new Stack<>();
        stack.push("Python");
        stack.push("Java");
        stack.push("C++");
        //haddini bil
        ///*/*/*/*/*/*/**/*/
        /*Enumeration<String> enumeration1=stack.elements();
        while (enumeration1.hasMoreElements()) {
            String nextElement = enumeration1.nextElement();
            System.out.println(nextElement);
        }*/
        /*System.out.println(stack.peek());//son karakter
        for (String string : stack) {
            System.out.println(string);
        }*/
        while (!stack.empty()) {            
            System.out.println("Eleman Çıkıyor :"+stack.pop()+" \ngüncel liste:");
            for (String string : stack) {
                System.out.println(string);
            }
        }
                }
    
}
