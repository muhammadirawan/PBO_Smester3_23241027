package com.tutorial;

class PersegiPanjang extends BangunDatar{
    float panjang, lebar;

    PersegiPanjang(){
        super("Persegi Panjang");
    }
    PersegiPanjang(float panjang, float lebar){
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    float luas(){
        return panjang * lebar;
    }
    float keliling(){
        return 2 * (panjang + lebar);
    }

    void displayInfo(){
        super.displayInfo("Panjang " + panjang + " dan lebar " + lebar);
        System.out.println("Luas : " + luas());
        System.out.println("Keliling : " + keliling());
    }
}