/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orangutanhaven4;

/**
 *
 * @author HP
 */
public class Dina extends OrangUtan{
    public Dina() {
       super("Dina", "Betina");
    }

    @Override
    public void lakukanAktivitas() {
        System.out.println(getNama()+ " ( " + getJenisKelamin() + " )  sedang melakukan aktivitas " + getAktivitas());
   
    }
}

