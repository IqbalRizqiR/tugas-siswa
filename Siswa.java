public class Siswa {
    int id;
    String nama;
    double ipk;

    // Default Construct
    public Siswa() {
        id = 0;
        nama = "null";
        ipk = 0.0;
    }

    // Params Construct

    public Siswa(int i, String n, double k) {
        id = i;
        nama = n;
        ipk = k;
    }

    // Getter


    // Setter



    // Method

    public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }
}