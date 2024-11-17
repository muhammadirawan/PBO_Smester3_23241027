class Data{
    // Data member atau Variabel
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;


    // Konstruktor dengan modifier public
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 100;
        this.doublePrivate = 3,14;

    }

    // method modifier default
    void cetak(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
    }

    // private
    public void setIntPrivate(int value){
        this.intPrivate = value;

    }
    // getter
    public double getDoublePrivate(){
        return this.doublePrivate;
    }
}



public class App {

    public static void main(String[] args) throws Exception {
        // instansiasi objek
        Data objek = new Data();

        // baca dan tulis public
        objek.intPublic = 50; // tulis
        System.out.println("public : " + objek.intPublic);// baca

        //tulis saja (setter)
        objek.setIntPrivate(value:10);
        objek.cetak();

        // baca saja (getter)
        double angka = objek.getDoublePrivate();
        System.out.println("getter : " + angka);
    }
}
