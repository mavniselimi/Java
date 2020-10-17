/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android10143;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Android10143 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list = new ArrayList<String>();
list.add("Ahmet");
list.add("Ozan");
list.add("Eda");
list.add("Ahu");

for (int i = 0; i < list.size(); i++) {
    list.remove(i);
}

for (String str : list) {
    System.out.println(str);
}
    }
    
}