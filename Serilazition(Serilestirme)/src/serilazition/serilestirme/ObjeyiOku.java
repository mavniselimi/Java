/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serilazition.serilestirme;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class ObjeyiOku {
    public static void main(String[] args) {
        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
            Ogrenci ogrenci1=(Ogrenci)in.readObject();
            Ogrenci ogrenci2=(Ogrenci)in.readObject();
            System.out.println("**************************");
            System.out.println(ogrenci1);
            System.out.println("**************************");
            System.out.println(ogrenci2);
        } catch (IOException e) {
        } catch (ClassNotFoundException ex) {
            System.err.println("Obje Bulunamadı");
        }
    }
}
