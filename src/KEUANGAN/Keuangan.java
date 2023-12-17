/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KEUANGAN;

/**
 *
 * @author Hannes
 */
public class Keuangan extends Akun {
    String barang,harga,jumlah,total,tanggal,k,d;

    
    void dataBarang(String Barang){
        this.barang = Barang;
    }
    void dataJumlah(String Jumlah){
        this.jumlah = Jumlah;
    }
    
    void dataHarga(String Harga){
        this.harga = Harga;
    }
    
    void dataTotal(String Total){
        this.total = Total;
    }
    
    void dataTanggal(String Tanggal){
        this.tanggal = Tanggal;
    } 
    
    
    String cetakBarang(){
        return barang;
    }
    
    String cetakHarga(){
        return harga;
    }
    
    String cetakJumlah(){
        return jumlah;
    }
    
    String cetakTotal(){
        return total;
    }
    
    String cetakTanggal(){
        return tanggal;
    }
     String cetakKredit() {
        return cetak("Kredit");
    }
    String cetakDebit() {
        return cetak("Debit");
    }
}
