package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Persegi persegi2 = new Persegi(5);
        Lingkaran lingkaran2 = new Lingkaran(7);
        PersegiPanjang pp2 = new PersegiPanjang(5, 3);
        Segitiga segitiga2 = new Segitiga(6, 8);

        System.out.println("=== INFORMASI BANGUN DATAR ===");
        persegi2.displayInfo();
        lingkaran2.displayInfo();
        pp2.displayInfo();
        segitiga2.displayInfo();
    }
}