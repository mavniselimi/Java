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
public class Kasa {
    private String Model;
    private String uretici;
    private int fan_sayisi;
    private boolean onoff;
    public Kasa(String Model, String uretici, int fan_sayisi) {
        this.Model = Model;
        this.uretici = uretici;
        this.fan_sayisi = fan_sayisi;
        this.onoff=false;
    }
    public void pc_ac()
    {
        this.onoff=true;
        System.out.println("Pc açılıyor..");
    }

    /**
     * @return the Model
     */
    public String getModel() {
        return Model;
    }

    /**
     * @param Model the Model to set
     */
    public void setModel(String Model) {
        this.Model = Model;
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
     * @return the fan_sayisi
     */
    public int getFan_sayisi() {
        return fan_sayisi;
    }

    /**
     * @param fan_sayisi the fan_sayisi to set
     */
    public void setFan_sayisi(int fan_sayisi) {
        this.fan_sayisi = fan_sayisi;
    }
    
}
