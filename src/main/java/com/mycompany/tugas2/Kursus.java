/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas2;
public class Kursus {
    String idKursus;
    String namaPeserta;
    String namaKursus;
    int durasi;
    int biayaPerJam;

    // constructor 1 
    public Kursus() {
         idKursus = "K000";
         namaPeserta = "Tidak diketahui";
         namaKursus = "Belum ada";
         durasi = 0;
         biayaPerJam = 50000;
}
    
    // constructor 2 (
    public Kursus(String idKursus, String namaPeserta, String namaKursus, int durasi, int biayaPerJam) {
        this.idKursus = idKursus;
        this.namaPeserta = namaPeserta;
        this.namaKursus = namaKursus;
        this.durasi = durasi;
        this.biayaPerJam = biayaPerJam;
}
        // create → isi data
    public void create(String id, String nama, String kursus, int durasiBaru, int biaya) {
        idKursus = id;
        namaPeserta = nama;
        namaKursus = kursus;
        durasi = durasiBaru;
        biayaPerJam = biaya;
    }

    //METHOD VOID
    // read tampilkan data
    public void read() {
        System.out.println("ID Kursus       : " + idKursus);
        System.out.println("Nama Peserta    : " + namaPeserta);
        System.out.println("Nama Kursus     : " + namaKursus);
        System.out.println("Durasi          : " + durasi + "Jam");
        System.out.println("Biaya Per Jam   : Rp" + biayaPerJam);
    }

    //METHOD RETURN
    // update status berhasil/gagal
    public boolean update(int durasiBaru) {
        if (durasiBaru > 0) {
            durasi = durasiBaru;
            return true;
        }
        return false;
    }

    // delete hapus data (reset)
    public String delete() {
        idKursus = "";
        namaPeserta = "";
        namaKursus = "";
        durasi = 0;
        return "\n====Data berhasil dihapus====";
}
    
    public int hitungTotalBiaya(){
        return durasi * biayaPerJam;
    }
}
