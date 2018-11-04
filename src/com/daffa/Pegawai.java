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
public class Pegawai {
    private int nip;
    private String jabatan;
    private String nama;

    public Pegawai(int nip,String jabatan, String nama) {
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String info(){
        String info = "";
        info +="Nip : " + this.nip + "\n";
        info +="jabatan : "+ this.jabatan+"\n";
        info +="Nama : " + this.nama + "\n";
        return info;
    }
}
