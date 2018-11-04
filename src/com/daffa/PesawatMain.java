/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daffa;

/**
 *
 * @author bagas
 */
public class PesawatMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai pilot = new Pegawai( 10,"Pilot","Red");             //inisiasi pilot
        Pegawai coPilot = new Pegawai( 11,"Co-Pilot","Blue");       //inisiasi copilot
        Pegawai pramugari = new Pegawai( 101,"Pramugari","Pink");   //inisiasi pramugari
        Pegawai pramugari2 = new Pegawai( 102,"pramugari","Yellow");//inisiasi pramugari2
        
        Penumpang p = new Penumpang("1001", "Mr. Krab");            //penumpang1
        Penumpang p2 = new Penumpang("1002", "Mr. Spongebob");      //penumpang2
        Penumpang p3 = new Penumpang("1003", "Mr. Patrick");        //penumpang3
        Pesawat lion = new Pesawat("737", 4);
        
        System.out.println(pilot.info());                           //Print info pilot dari class Pegawai
        System.out.println(coPilot.info());                         //Print info coPilot dari class Pegawai
        System.out.println(pramugari.info());                       //Print info pramugari dari class Pegawai
        System.out.println(pramugari2.info());                      //Print info pramugari2 dari class Pegawai
        
        lion.setPenumpang(p, 1);                                    //setTempat dudukPenumpang
        lion.setPenumpang(p2, 2);                                   //setTempat dudukPenumpang
        lion.setPenumpang(p3, 3);                                   //setTempat dudukPenumpang
        
        System.out.println(lion.info());                            //set kode penerbangan dan jumlah kursi
    }
    
}
