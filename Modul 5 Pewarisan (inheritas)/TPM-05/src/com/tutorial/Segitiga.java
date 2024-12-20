package com.tutorial;

class Segitiga extends BangunDatar{
    float alas, tinggi;

    Segitiga(){
        super("Segitiga");
    }
    Segitiga (float alas, float tinggi){
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    float luas(){
        return (alas * tinggi) / 2;
    }
    float keliling(){
    float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
    return alas + tinggi + sisiMiring;
    }

    void displayInfo(){
        super.displayInfo("alas " + alas + " dan tinggi " + tinggi);
        System.out.println("Luas : " + luas());
        System.out.println("Keliling : " + keliling());
    }
}