class HitungGajiBersih{
    // Atribut
    private int gaji_pokok;
    private int tunjangan;
    private double pajak;

    // setter dan getter gaji pokok
    public void setGajiPokok(int gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }
    
    public int getGajiPokok(){
        return gaji_pokok;
    }
    
    // setter dan getter tunjangan
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    
    public int getTunjangan(){
        return tunjangan;
    }

    // setter dan getter pajak
    public void setPajak(int pajak){
        this.pajak = pajak;
    }
    
    public int getPajak(){
        return pajak;
    }

    //method untuk menghitung gaji bersih
    public voidß cetakGajiBersih(){
        double gajiBersih = (gaji_pokok + tunjangan) - ((gaji_pokok + tunjangan ) * pajak / 100);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // instansi objek
        HitungGajiBersih gaji = new HitungGajiBersih();

        // mengatur nilai gaji pokok, tunjangan dan pajak
        gaji.setGajiPokok(5000000);
        gaji.setTunjangan(1000000);
        gaji.setPajak(10);

        System.out.println("Gaji Bersih : " + gaji.cetakGajiBersih);
        
    }
}
