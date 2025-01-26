import java.util.*;
public class Tugas1 {
    /*1. Buatlah sebuah deklarasi variabel dengan tipe data integer yang bernama ‘nilai’?  */
    public static void main(String[] args) {
        int nilai = 200;
        System.out.println("Hasilnya adalah " + nilai);

        /*2. Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘kata’ yang berisi kata ‘struktur’?  */
        String kata = "struktur";
        System.out.println(kata);

        /*3.	Buatlah pendeklarasian array satu dimensi dengan nama array adalah ‘arraySatu’, tipe data integer, 
        yang berisi angka (12, 10, 40)?Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.  */
        int [] arraySatu = {12,10,40};
        System.out.println("Hasilnya adalah");
        for (int i = 0; i < 3; i++) {
            System.out.print(arraySatu[i] + " ");
        }

        /*4. Buatlah pendeklarasian array dua dimensi dengan nama array adalah ‘arrayDua’, tipe data integer, 
        yang terdiri dari dua baris dan tiga kolom, seperti pada matrik berikut: 
        12   10   40 
        13  11   41 
        14  12   42 
        Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.*/
        int [][] arrayDua = {{12,10,40},{13,11,41},{14,12,42}};
        System.out.println("Array Dengan Matriks 3x3 = ");
        for (int i = 0; i < arrayDua.length; i++) {
            for (int j = 0; j < arrayDua[i].length; j++) {
                System.out.print(arrayDua[i][j] + "\t");
            }
            System.out.println();
        }

        /*Buatlah deklarasi linked list yang memiliki list (10, 20, 30, 40, 50)? 
        Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. */
        LinkedList<Integer> LinkedList = new LinkedList<>();
        LinkedList.add(10);
        LinkedList.add(20);
        LinkedList.add(30);
        LinkedList.add(40);
        LinkedList.add(50);

        System.out.println(" Hasilnya Adalah " + LinkedList);
    }
}

    
