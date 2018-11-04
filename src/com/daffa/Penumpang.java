/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.daffa;

/**
 *
 * @author Expression daffa is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class Penumpang {
    private String noKursi;
    private String nama;
    private Pegawai pilot;
    private Pegawai pramugari;

    public Pegawai getPilot() {
        return pilot;
    }

    public void setPilot(Pegawai pilot) {
        this.pilot = pilot;
    }

    public Pegawai getPramugari() {
        return pramugari;
    }

    public void setPramugari(Pegawai pramugari) {
        this.pramugari = pramugari;
    }
    
    
    
    public Penumpang(String noKursi, String nama) {
        this.noKursi = noKursi;
        this.nama = nama;
    }

    public String getKtp() {
        return noKursi;
    }

    public void setKtp(String noKursi) {
        this.noKursi = noKursi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
    
    
    public String info(){
        String info ="";
        info += "No Kursi : " + noKursi +"\n";
        info += "Nama : " + nama +"\n";
        return info;
        
    }
}
