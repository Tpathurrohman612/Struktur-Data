public class countingsort { 
/*2. Buatlah coding pengurutan data dari terkecil hingga terbesar dari data berikut 
(a1, a2, a3, a4, a5, a6) tentukan sendiri nilai a1 sampai a6. Urutkan dengan 
menggunakan algoritma Counting-sort? Kemudian anda analisa kinerja algoritma tersebut? */
    void sort (char arr[]) {
        int n = arr.length;
        char output[] = new char[n];
        int count [] = new int[256];

        for (int i = 0; i < 256; ++i) count[i] = 0;
        for (int i = 0; i < n; ++i) ++count[arr[i]];

        for (int i = 1; i < 255; ++i) count[i] += count[i - 1];

        for (int i = 0; i < n; ++i) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i < n; ++i) arr[i] = output[i];
    }

    public static void main(String[] args) {
        countingsort ob = new countingsort();
        char arr[] = {'w', 'k', 'p', 'a', 'l', 'o'};

        ob.sort(arr);
        System.out.print("Hasilnya adalah: ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
//Taufik Pathurrohman
}
