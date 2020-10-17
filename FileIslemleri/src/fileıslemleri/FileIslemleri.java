/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileıslemleri;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class FileIslemleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*FileWriter writer=null;
        try {
            writer=new FileWriter("dosya.txt",true);
            writer.write("Abdülkadir Alkan cCc\n");
            writer.write("Yat Aşşağı\n");
        } catch (IOException ex) {
            System.out.println("Dosya Açılamadı");

        }
        finally{
            if (writer!=null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileIslemleri.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }*/
        try(FileReader reader=new FileReader("dosya.txt");/*FileWriter writer=new FileWriter("dosya.txt")*/){
           // writer.write("31");
            //FileReader reader=new FileReader("dosya.txt");
            Scanner s=new Scanner((new BufferedReader(new FileReader("dosya.txt"))));
            int a;
            String b="";
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
                
            }
            System.out.println(b);
        } catch (IOException ex) {
            System.out.println("HATA 404");
        }
       
        //Scanner scanner = new BufferedReader();
    }
    
}
