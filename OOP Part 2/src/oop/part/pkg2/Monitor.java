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
public class Monitor {
    private String uretici;
    private String model;
    private String cozunurluk;
    private double inch;
    private Resuliton resuliton;

    public Monitor(String uretici, String model, String cozunurluk, double inch, Resuliton resuliton) {
        this.uretici = uretici;
        this.model = model;
        this.cozunurluk = cozunurluk;
        this.inch = inch;
        this.resuliton = resuliton;
    }
    public void MonitorAc(){
        System.out.println("Monitör Açılıyor");
    }

    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return the cozunurluk
     */
    public String getCozunurluk() {
        return cozunurluk;
    }

    /**
     * @return the inch
     */
    public double getInch() {
        return inch;
    }

    /**
     * @return the resuliton
     */
    public Resuliton getResuliton() {
        return resuliton;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @param cozunurluk the cozunurluk to set
     */
    public void setCozunurluk(String cozunurluk) {
        this.cozunurluk = cozunurluk;
    }

    /**
     * @param inch the inch to set
     */
    public void setInch(double inch) {
        this.inch = inch;
    }

    /**
     * @param resuliton the resuliton to set
     */
    public void setResuliton(Resuliton resuliton) {
        this.resuliton = resuliton;
    }
    
}
