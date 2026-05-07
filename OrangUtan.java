/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orangutanhaven4;

/**
 *
 * @author HP
 */
public abstract class OrangUtan {
    private final String nama;
    private final String jenisKelamin;
    private String aktivitas;
    private String respon;

    public OrangUtan(String nama, String jenisKelamin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    public void setAktivitas(String aktivitas) {
        if (aktivitas.equals("Makan") ||
            aktivitas.equals("Manjat") || 
            aktivitas.equals("Istirahat") || 
            aktivitas.equals("Interaksi")) 
           {this.aktivitas = aktivitas;
        } 
        else {
            System.out.println("Aktivitas tidak valid!");
            this.aktivitas = "Tidak diketahui";
        }
    }
    
    public abstract void lakukanAktivitas();

    public void cekRespon(String pengunjung) {
        this.respon = "Bereaksi tenang terhadap " + pengunjung;
        System.out.println(nama + " " + respon);
    }

    public void cekRespon(String pengunjung, int jumlah) {
        if (jumlah > 10) {
            this.respon = "Merasa terganggu oleh keramaian (" + jumlah + " orang)";
        } 
        else {
            this.respon = "Tetap tenang meskipun ada " + jumlah + " " + pengunjung;
        }
        System.out.println(nama + " " + respon);
    }

    public String getNama() { return nama; }
    public String getAktivitas() { return aktivitas; } 
    public String getJenisKelamin() {return jenisKelamin; }
}

