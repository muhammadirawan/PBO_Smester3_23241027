package com.tutorial;

class Persegi extends BangunDatar{
    float sisi;

    Persegi(){
        super("Persegi");
    }
    Persegi(float sisi){
        super("Persegi");
        this.sisi = sisi;
    }
    float luas(){
        return sisi * sisi;
    }
    float keliling(){
        return 4 * sisi;
    }

    void displayInfo(){
        super.displayInfo("sisi" + sisi);
        System.out.println("Luas : " + luas());
        System.out.println("Keliling : " + keliling());
    }
}