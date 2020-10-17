/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorsandqueues;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pc
 */
public class Radyo implements Iterable<String>{
    private ArrayList<String> kArrayList=new ArrayList<>();
    
    public class RadyoIterator implements Iterator<String>{
        private int index=0;
        @Override
        public boolean hasNext() {
            if (index<kArrayList.size()){
                return true;
            }
            else{
                return false;
            }
        }

        @Override
        public String next() {
            String deger=kArrayList.get(index);
            index++;
            return deger;
        }
        
    }
    public Radyo(String[] k){
        for (String string : k) {
            kArrayList.add(string);
        }
    }

    @Override
    public Iterator<String> iterator() {
       // return kArrayList.iterator(); //To change body of generated methods, choose Tools | Templates.
       return new RadyoIterator();
    }
}
