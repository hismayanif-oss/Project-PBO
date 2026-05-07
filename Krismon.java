/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orangutanhaven4;

/**
 *
 * @author HP
 */
public class Krismon  extends OrangUtan {
    public Krismon() {
       super("krismon", "Jantan");
    }

    @Override
    public void lakukanAktivitas() {
        System.out.println(getNama()+ " ( " + getJenisKelamin() + " )  sedang melakukan aktivitas " + getAktivitas());
   
    }
    
}
   
