public class SiswaTester {
    public static void main(String[] args) {
        Siswa arkan = new Siswa();
        Siswa ito = new Siswa();
        Siswa rabbani = new Siswa();
        Siswa davin = new Siswa();
        Siswa nafis = new Siswa();
        Siswa anak = new Siswa(20, "Tuak", 80.5);
        arkan.id = 22;
        arkan.nama = "Muhammad Arkan Mariadi";
        arkan.ipk = 90.5;

        nafis.id = 25;
        nafis.nama = "Nafis Dwi Harits";
        nafis.ipk = 87.5;

        ito.id = 4;
        ito.nama = "Anggito Abimanyu";
        ito.ipk = 88.5;

        davin.id = 8;
        davin.nama = "Davin Falih Ramadhan";
        davin.ipk = 91.5;
        
        rabbani.id = 23;
        rabbani.nama = "Muhammad Rabbani Aryanta";
        rabbani.ipk = 93.5;

        arkan.print();
        System.out.println("--------");
        davin.print();
        System.out.println("--------");
        nafis.print();
        System.out.println("--------");
        rabbani.print();
        System.out.println("--------");
        ito.print();
        System.out.println("--------");
        anak.print();
        System.out.println("--------");
    }


    // Constructor

}
