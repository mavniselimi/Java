/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author pc
 */
public class PublicClass implements Imuhendis{
    private boolean askerlik;
    private boolean adli_sicil;

    public PublicClass(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    @Override
    public void askerlik_sorgula() {
        if (askerlik) {
            System.out.println("Askerlik yaptım");
        }
        else if (askerlik==false) {
            System.err.println("Askerlik yapılmadı");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return  "Ortalama: "+derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adli_sicil) {
            System.err.println("Adli sicil bulunuyor");
        }
        else if (adli_sicil==false) {
            System.out.println("Adli Sicil bulunmuyor");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.print("Bilgisiyar Mühendisi Olarark şu şirketlerde çalıştım==>");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
    }
    
}
