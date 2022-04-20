import java.util.*;

public class Toko {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Deklarasi nama produk
        ArrayList<String> Produk = new ArrayList<>();
        Produk.add("Es Krim");
        Produk.add("Kopi");
        Produk.add("Teh");
        Produk.add("Susu");
        Produk.add("Wafer");

        //Deklarasi harga produk
        ArrayList<Integer> Harga = new ArrayList<>();
        Harga.add(5000);
        Harga.add(3000);
        Harga.add(2000);
        Harga.add(3500);
        Harga.add(5000);

        //Pemilihan opsi
        System.out.println("PILIHAN AKSI: ");
        System.out.println("1. Tambah produk");
        System.out.println("2. Hapus produk");
        System.out.println("3. Cari produk");
        System.out.println("4. Keluar");

        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Masukkan nama produk: ");
                String nama_baru = sc.next();
                System.out.println("Masukkan harga produk: ");
                int harga_baru = sc.nextInt();
                Produk.add(nama_baru);
                Harga.add(harga_baru);
                System.out.println("Produk yang tersedia: ");
                for (int i = 0; i < Produk.size(); i++) {
                    System.out.print(Produk.get(i)+" , ");
                }
                break;
            case 2:
                System.out.println("Masukkan index produk yang ingin dihapus: ");
                int index_hapus = sc.nextInt();
                Produk.remove(index_hapus);
                Harga.remove(index_hapus);
                System.out.println("Produk yang tersedia: ");
                for (int i = 0; i < Produk.size(); i++) {
                    System.out.print(Produk.get(i)+" , ");
                }
                break;
            case 3:
                System.out.println("Masukkan nama produk yang ingin dicari: ");
                String nama_cari = sc.next();
                if (Produk.contains(nama_cari)) {
                    System.out.println("Produk dengan nama "+nama_cari+" tersedia");
                } else {
                    System.out.println("Produk dengan nama "+nama_cari+" tidak tersedia");
                }
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan aplikasi ini");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
    }
}
