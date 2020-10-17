/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.part.pkg2;

/**
 *
 * @author pc
 */
public class Anakart {
    private String model;
    private String uretici;
    private int yuva_sayisi;
    private String isletim_sistemi;
    private String cpu;
    private String ekran_karti;

    public Anakart(String model, String uretici, int yuva_sayisi, String isletim_sistemi, String cpu, String ekran_karti) {
        this.model = model;
        this.uretici = uretici;
        this.yuva_sayisi = yuva_sayisi;
        this.isletim_sistemi = isletim_sistemi;
        this.cpu = cpu;
        this.ekran_karti = ekran_karti;
    }
      public void isletimsistemiyukle(String yeniisletimsistemi){
          this.isletim_sistemi=yeniisletimsistemi;
          System.out.println("Yeni isletim sistemi başarıyla yüklendi===>"+yeniisletimsistemi);
      }
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    /**
     * @return the yuva_sayisi
     */
    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    /**
     * @param yuva_sayisi the yuva_sayisi to set
     */
    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }

    /**
     * @return the isletim_sistemi
     */
    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    /**
     * @param isletim_sistemi the isletim_sistemi to set
     */
    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }
}
