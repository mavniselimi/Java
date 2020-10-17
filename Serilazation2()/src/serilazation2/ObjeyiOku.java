/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serilazation2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class ObjeyiOku {
    public static void main(String[] args) {
        
        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("ogrenciler2.bin"))){
            /*out.writeObject(ogrencis);
            out.writeObject(ogrencis1);*/
            Ogrenci[] ogrencis=(Ogrenci[])in.readObject();
            ArrayList<Ogrenci> ogrencis1=(ArrayList<Ogrenci> )in.readObject();
            System.out.println("**************************************");
            for (Ogrenci ogrenci : ogrencis) {
                System.out.println(ogrenci+"\n************************");
            }
        } catch (IOException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjeyiOku.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
