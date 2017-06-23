package com.example.okki.perpustakaan.model;

/**
 * Created by OKKI on 12/06/2017.
 */

public class BukuModel {
    private String IdBuku,
            namaBuku,
            pengarang,
            penerbit,
            tanggal_terbit,
            kategori,
            banyakBuku;
    int image;

    public BukuModel(String idBuku, int image,String namaBuku, String pengarang, String penerbit, String tanggal_terbit, String kategori, String banyakBuku) {
        IdBuku = idBuku;
        this.image = image;
        this.namaBuku = namaBuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tanggal_terbit = tanggal_terbit;
        this.kategori = kategori;
        this.banyakBuku = banyakBuku;
    }

    public String getIdBuku() {
        return IdBuku;
    }

    public void setIdBuku(String idBuku) {
        IdBuku = idBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTanggal_terbit() {
        return tanggal_terbit;
    }

    public void setTanggal_terbit(String tanggal_terbit) {
        this.tanggal_terbit = tanggal_terbit;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getBanyakBuku() {
        return banyakBuku;
    }

    public void setBanyakBuku(String banyakBuku) {
        this.banyakBuku = banyakBuku;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
