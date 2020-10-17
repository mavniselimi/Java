/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serilazation2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author pc
 */
public class ObjeyiYaz {
    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci("Abdülkadir",1234,"Bilgisiyar Mühendisliği");
        Ogrenci ogrenci2=new Ogrenci("Efe",1235,"Tıp Fakultesi");
        Ogrenci[] ogrencis={ogrenci1,ogrenci2};
        ArrayList<Ogrenci> ogrencis1=new ArrayList<>(Arrays.asList(ogrencis));
        
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("ogrenciler2.bin"))){
            out.writeObject(ogrencis);
            out.writeObject(ogrencis1);
        } catch (IOException e) {
        }
        
    }
}
