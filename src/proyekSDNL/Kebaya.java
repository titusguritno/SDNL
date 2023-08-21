/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyekSDNL;

/**
 *
 * @author Asus-GK
 */
public class Kebaya {
    private int id = (int)(Math.random() * 101);
    private String asal;
    private String jenisKebaya;
    private String namaKebaya;
    private Double harga;

    public Kebaya(String asal, String jenisKebaya, String namaKebaya, Double harga) {
        this.namaKebaya = namaKebaya;
        this.jenisKebaya = jenisKebaya;
        this.asal = asal;
        this.harga = harga;
    }

    public String getNamaKebaya() {
        return namaKebaya;
    }

    public void setNamaKebaya(String namaKebaya) {
        this.namaKebaya = namaKebaya;
    }

    public String getJenisKebaya() {
        return jenisKebaya;
    }

    public void setJenisKebaya(String jenisKebaya) {
        this.jenisKebaya = jenisKebaya;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    
}
