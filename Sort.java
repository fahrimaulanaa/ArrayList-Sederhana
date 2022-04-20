import java.util.Scanner;
import java.util.Arrays;

public class Sort {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("SISTEM SORTING ARRAY SEDERHANA"); 
        System.out.println("");
        System.out.println("Masukkan jumlah elemen Array: ");

        int jumlah = sc.nextInt();
        int array[] = new int[jumlah]; 
        
        System.out.println("");
        System.out.println("Masukkan "+jumlah+" elemen array: ");
        for (int i = 0; i < jumlah; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("");
        System.out.println("UNSORTED ARRAY: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(array[i]+" , ");
        }
        
        System.out.println("");
        System.out.println("SORTED ARRAY: ");
        Arrays.sort(array);
        for (int i = 0; i < jumlah; i++) {
            System.out.print(array[i]+" , ");
        }
    }    
}