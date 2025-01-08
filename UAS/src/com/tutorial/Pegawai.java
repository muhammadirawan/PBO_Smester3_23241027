package com.tutorial;

public class Pegawai {
    private String nama;
    private double gajiPokok;
    private double gajiBersih;  

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.gajiBersih = 0;
    }

    public double getGajiBersih() {
        return this.gajiBersih;
    }

    protected void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }
    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void hitungGajiBersih() {
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
