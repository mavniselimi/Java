/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanlar.uygulamasi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class CalisanIslemleri {
    private Connection con=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;

    public boolean girisYap(String k,String s){
        String sorgu="Select * from admin where passWord=? and username=?";
        try {
            preparedStatement=(PreparedStatement) con.prepareStatement(sorgu);
            preparedStatement.setString(1, s);
            preparedStatement.setString(2, k);
            ResultSet rs=preparedStatement.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public CalisanIslemleri() {
        String url="jdbc:mysql://"+DbDatabase.host+":"+DbDatabase.port+"/"+DbDatabase.db_ismi+"?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Bulunamadı");
        }
        try {
            con=(Connection) DriverManager.getConnection(url,DbDatabase.kullaniciadi,DbDatabase.passWord);
            System.out.println("Bağlantı Başarılı");
            
        } catch (SQLException e) {
           // System.out.println("Bağlantı Başarısız");
           e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CalisanIslemleri islemler=new CalisanIslemleri();
    }

    public ArrayList<Calisan> calisanlariGetir() {
        ArrayList<Calisan> cikti =new ArrayList<>();
        try {
            statement=(Statement) con.createStatement();
            String sorgu="Select * From calisanlar";
            ResultSet rs=statement.executeQuery(sorgu);
            while (rs.next()) {
                int id=rs.getInt("id");
                String ad=rs.getString("ad");
                String soyad=rs.getString("soyad");
                String email=rs.getString("email");
                String maas=rs.getString("maaş");
                cikti.add(new Calisan(id, ad, soyad, maas, email));
                
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void calisanEkle(String ad, String soyad, String email, String maas) {
        String sorgu="Insert Into calisanlar (ad,soyad,email,maaş) VALUES (?,?,?,?)";
        try {
            preparedStatement=(PreparedStatement) con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, maas);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void calisanGüncelle(int id, String ad, String soyad, String email, String maas) {
       String sorgu="Update calisanlar set ad=? , soyad=? , email=? , maaş=? where id=?";    
        try {
            preparedStatement=(PreparedStatement) con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, maas);
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void calisanSil(int id) {
        String sorgu;
        sorgu="Delete from calisanlar where id=?";
        try {
            preparedStatement=(PreparedStatement) con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
