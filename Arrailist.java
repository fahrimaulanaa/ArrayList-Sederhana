import java.util.*;

public class Arrailist {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Integer> harga = new ArrayList<>();  
        harga.add(25000);
        harga.add(30000);
        harga.add(40000);
        harga.add(50000);

        System.out.println("Harga mobil yang tersedia: ");
        for (int i = 0; i < harga.size(); i++) {
            System.out.print(harga.get(i)+" , ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("PILIHAN AKSI: ");
        System.out.println("1. Tambah mobil");
        System.out.println("2. Hapus mobil");
        System.out.println("3. Cari mobil");
        System.out.println("4. Keluar");

        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Masukkan harga mobil: ");
                int harga_baru = sc.nextInt();
                harga.add(harga_baru);
                System.out.println("Harga mobil yang tersedia: ");
                for (int i = 0; i < harga.size(); i++) {
                    System.out.print(harga.get(i)+" , ");
                }
                break;
            case 2:
                System.out.println("Masukkan index harga mobil yang ingin dihapus: ");
                int harga_hapus = sc.nextInt();
                harga.remove(harga_hapus);
                System.out.println("Harga mobil yang tersedia: ");
                for (int i = 0; i < harga.size(); i++) {
                    System.out.print(harga.get(i)+" , ");
                }
                break;
            case 3:
                System.out.println("Masukkan  harga mobil yang ingin dicari: ");
                int harga_cari = sc.nextInt();
                if (harga.contains(harga_cari)) {
                    System.out.println("Mobil dengan harga "+harga_cari+" tersedia");
                } else {
                    System.out.println("Mobil dengan harga "+harga_cari+" tidak tersedia");
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
