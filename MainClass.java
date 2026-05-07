/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orangutanhaven4;

/**
 *
 * @author HP
 */
public class MainClass {
        public static void main(String[] args) {
        
        OrangUtan[] tracker = new OrangUtan[6];
        
        tracker[0] = new  Leuser();
        tracker[1] = new Krismon();
        tracker[2] = new Fhazren();
        tracker[3] = new Deknong();
        tracker[4] = new Dina();
        tracker[5] = new Lewis();
        
        tracker[0].setAktivitas("Manjat");
        tracker[1].setAktivitas("Interaksi");
        tracker[2].setAktivitas("Makan");
        tracker[3].setAktivitas("Istirahat");
        tracker[4].setAktivitas("Makan");
        tracker[5].setAktivitas("Interaksi");
        
       System.out.println("===================================================");            
            System.out.println(" Kelompok Cherifide :     PROJECT ORANG UTAN HAVEN");            
            System.out.println("        1           :     Fika hismayani     2503312321      IF D SG");            
            System.out.println("        2           :     Ria matilda        2503311909      IF D SG");            
            System.out.println("        3           :     Devi padillah      2503311581      IF D SG");
            System.out.println("        4           :     Cheren juana AS    2503312296      IF D SG");
            System.out.println("===================================================");           
            
       System.out.println("----- Aktivitas -----");
        for (OrangUtan o : tracker) {
            o.lakukanAktivitas();
        }
        
         System.out.println("----- Cek Respon -----");
        for (OrangUtan o : tracker) {
            o.cekRespon("Pengunjung", 5);
        }
    }
}
