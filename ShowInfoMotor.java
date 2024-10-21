class MOTOR{
    String merk;
    int tahun;
    String noPolisi;
    String warna;

    public MOTOR(String merek, int tahun, String noPolisi,String warna){
        this.merk = merek;
        this.tahun = tahun;
        this.noPolisi= noPolisi;
        this.warna = warna;
    }
    void showInfoMotor(){
        System.out.println("Merek : " + this.merk);
        System.out.println("Tahun : " + this.tahun);
        System.out.println("No Polisi : " + this.noPolisi);
        System.out.println("Warna : " + this.warna);
    }
}
public class App {
    public static void main(String[] args) {
        MOTOR mtr1 = new MOTOR("Honda NMX", 1997, "G 24343", "Pink");
        mtr1.showInfoMotor();
    }
}


