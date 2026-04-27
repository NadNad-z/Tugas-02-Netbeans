/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2;

public class Tugas2 {

    public static void main(String[] args) {
         //object 1
        Kursus k1 = new Kursus();
        
         //object 2 
        Kursus k2 = new Kursus(
            "K001",
            "Yulia Nada Zahrah",
            "Kursus Pemprograman Python",
            2,
            50000
        );
    
        System.out.println("\n====Data Kursus 1===="); 
        k1.read();
        
        System.out.println("\n====Data Kursus 2===="); 
        k2.read();
        System.out.println("Total Bayar     : Rp" + k2.hitungTotalBiaya()); 
        
        k2.update(3);
        System.out.println("\n====Setelah Update===="); 
        k2.read();
        System.out.println("Total Bayar     : Rp" + k2.hitungTotalBiaya());
        
        System.out.println(k2.delete()); 
        k2.read();
        }
}