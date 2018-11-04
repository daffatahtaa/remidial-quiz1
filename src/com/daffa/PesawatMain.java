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
        Pegawai pilot = new Pegawai( 10,"Pilot","Red");
        Pegawai coPilot = new Pegawai( 11,"Co-Pilot","Blue");
        Pegawai pramugari = new Pegawai( 101,"Pramugari","Pink");
        Pegawai pramugari2 = new Pegawai( 102,"pramugari","Yellow");
        
        Penumpang p = new Penumpang("1001", "Mr. Krab");
        Penumpang p2 = new Penumpang("1002", "Mr. Spongebob");
        Penumpang p3 = new Penumpang("1003", "Mr. Patrick");
        Pesawat lion = new Pesawat("737", 4);
        
        System.out.println(pilot.info());
        System.out.println(coPilot.info());
        System.out.println(pramugari.info());
        System.out.println(pramugari2.info());
        
        lion.setPenumpang(p, 1);
        lion.setPenumpang(p2, 2);
        lion.setPenumpang(p3, 3);
        
        System.out.println(lion.info());
    }
    
}
