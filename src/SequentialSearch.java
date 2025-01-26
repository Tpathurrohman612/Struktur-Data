/*1.Buatlah sebuah program searching (algoritma sequential search) dengan menggunakan 
bahasa Java. Adapun data yang dimasukkan yaitu (a1, a2, a3, a4, a5) silahkan tentukan sendiri 
nilai dari a1 sampai a5, lakukan pencarian angka n (tentukan sendiri) pada data tersebut. 
Berikan penjelasan tahap demi tahap proses searching tersebut, gambarkan dengan rinci prosesnya. */
import java.util.Scanner;
public class SequentialSearch {
    public static void main(String[] args) {
        int[] data = {65,21,43,76,121};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Angka yang akan di cari: ");
        int n = scanner.nextInt();

        int index = sequentialSearch(data, n);
        
        if (index != -1) {
            System.out.println("Angka " + n + " Ditemukan pada index " + index);
        } else {
            System.out.println("Angka " + n + " Tidak ditemukan pada Data");
        }
        scanner.close();

    }

    public static int sequentialSearch (int[] data, int n) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == n) {
                return i;
            }
        }
        return -1;
    }
    //Taufik Pathurrohman
    //049973116
}
