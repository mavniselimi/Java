/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.ve.mysql.veritabani;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Mysqll {
   private final  String kullaniciadi="root";
   private final String passWord="";
   private final String db_ismi="jdemo";
   private final String host="localhost";
   private final int port=3306;
   private Statement statement=null;
   private Connection con=null;
   private PreparedStatement preparedStatement=null;
   public void preaperadKullanıcılarıGetir(){
       try {
           statement=(Statement) con.createStatement();
           String sorgu="Select * from calisanlar where ad like 'A'";
           ResultSet rs=statement.executeQuery(sorgu);
           while (rs.next()) {
               System.out.println("İd: "+rs.getInt("id")+"Ad: "+rs.getString("ad")+" Soyad: "+rs.getString("soyad")+" Email: "+rs.getString("email"));
               
           }
       } catch (SQLException ex) {
           Logger.getLogger(Mysqll.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    public void calisanlariGEtir() {
        String sorgu="Select * from calisanlar";
       try {
           statement=(Statement) con.createStatement();
           ResultSet rs=statement.executeQuery(sorgu);
           while (rs.next()) {
               int id=rs.getInt("id");
               String ad=rs.getString("ad");
               String soyad=rs.getString("soyad");
               String email=rs.getString("email");
               System.out.println("id: "+id+" ad: "+ad+" soyad: "+soyad+" email: "+email);
           }
       } catch (SQLException ex) {
           Logger.getLogger(Mysqll.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    public void calisanlariEkle(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nAdınızı Giriniz==>");
        String a=scanner.nextLine();
        System.out.print("\nSoyadınızı Giriniz==>");
        String s=scanner.nextLine();
        System.out.print("\nEmailinizi Giriniz==>");
        String e=scanner.nextLine();
        
       try {
           statement=(Statement) con.createStatement();
       } catch (SQLException ex) {
           Logger.getLogger(Mysqll.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           statement.executeUpdate("Insert Into calisanlar (ad,soyad,email) VALUES('"+a+"','"+s+"','"+e+"')");
          
       } catch (SQLException ex) {
           Logger.getLogger(Mysqll.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    public void calisanlariEkle(String ad,String soyad,String email){
        
        
       try {
           statement=(Statement) con.createStatement();
       } catch (SQLException ex) {
           Logger.getLogger(Mysqll.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           statement.executeUpdate("Insert Into calisanlar (ad,soyad,email) VALUES('"+ad+"','"+soyad+"','"+email+"')");
       } catch (SQLException ex) {
           Logger.getLogger(Mysqll.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
    public Mysqll() {
        String url="jdbc:mysql://"+host+":"+port+"/"+db_ismi+"?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Bulunamadı");
        }
        try {
                con=(Connection) DriverManager.getConnection(url,kullaniciadi,passWord);
            System.out.println("Bağlantı Başarılı");
            
        } catch (SQLException e) {
           // System.out.println("Bağlantı Başarısız");
           e.printStackTrace();
        }
        
    }
    public void CalisanGüncelle(int id,String a,boolean ad,boolean soyad,boolean email){
       try {
           statement=(Statement) con.createStatement();
           String sorgu="Update calisanlar Set"; 
           String hiut = null;
            if (email) {
               hiut=sorgu+" email='"+a+" where id="+id;
            
            }if (ad) {
               hiut=sorgu+" ad='"+a+"'"+" where id="+id;
            
            }if (soyad) {
               hiut=sorgu+" soyad='"+a+"'"+" where id="+id;
            
            }
           statement.executeUpdate(hiut);
       } catch (SQLException ex) {
           Logger.getLogger(Mysqll.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    public void CalisanGüncelle(int id,String a,String s,boolean ad,boolean soyad,boolean email){
        try {
           statement=(Statement) con.createStatement();
           String sorgu="Update calisanlar Set"; 
           String hiut = null;
           if (email&&ad) {
               hiut=sorgu+" email='"+s+"' ad='"+a+"'"+" where id="+id;
            }else if (ad&&soyad) {
               hiut=sorgu+" soyad='"+s+"' ad='"+a+"'"+" where id="+id;
            
            }else if (soyad&&email) {
               hiut=sorgu+" email='"+s+"' soyad='"+a+"'"+" where id="+id;
            
            }
           statement.executeUpdate(hiut);
       } catch (SQLException ex) {
           Logger.getLogger(Mysqll.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    public  void CalisanKOV_xD (int id){
       try {
            String sorgu="DELETE FROM calisanlar WHERE id = "+id;
           statement=(Statement) con.createStatement();
           statement.executeUpdate(sorgu);
       } catch (SQLException ex) {
           Logger.getLogger(Mysqll.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }
    public void CalisanGüncelle(int id,String a,String s,String e,boolean ad,boolean soyad,boolean email){
        
        String sorgu="Update calisanlar Set"; 
           String hiut = null;
           try {
           statement=(Statement) con.createStatement();
           
            
            
              hiut=sorgu+" email='"+e+"' ad='"+a+"' soyad='"+s+"' where id="+id;
            
       } catch (SQLException ex) {
           Logger.getLogger(Mysqll.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           statement.executeUpdate(hiut);
       } catch (SQLException ex) {
           Logger.getLogger(Mysqll.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    public static void main(String[] args) {
        Mysqll mysql=new Mysqll();
        System.out.println("before");
       // mysql.calisanlariGEtir();
       // mysql.calisanlariEkle("Ahmed Hamid","Uşaklı","uşak6363@gmail.com");
        System.out.println("after");
       // mysql.CalisanGüncelle(6, "Muhammed Yasin", true, false, false);
       // mysql.CalisanKOV_xD(9);
      //  mysql.calisanlariGEtir();
      mysql.preaperadKullanıcılarıGetir();
      
      
    }
}