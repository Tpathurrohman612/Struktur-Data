/*2.Buatlah sebuah program searching (algoritma binary search) 
dengan menggunakan bahasa Java. Adapun data yang dimasukkan yaitu 
(a1, a2, a3, a4, a5) silahkan tentukan sendiri nilai dari a1 sampai a5, 
lakukan pencarian angka n (tentukan sendiri) pada data tersebut. 
Berikan penjelasan tahap demi tahap proses searching tersebut, gambarkan dengan rinci prosesnya. */
import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch (int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {5,15,25,35,45};

        System.out.print("Masukan Angka yang akan di cari: ");
        int target = scanner.nextInt();
        
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Angka " + target + " Ditemukan pada Index: " + result);
        } else {
            System.out.println("Angka " + target + "Tidak ditemukan dalam Array");
        }
        scanner.close();
    }
    //Taufik Pathurrohman
    //049973116
}
