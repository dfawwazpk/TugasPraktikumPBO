package ArrayList;

import java.util.ArrayList;

/*
	Nama  File	: ArrayListTest.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 31 Mei 2023
	Deskripsi	: Program penggunaan objek ArrayList sebagai Collection class
*/

public class ArrayListTest {
    public static void main(String[] args) {
		//inisialisasi ArrayList yang hanya dapat berisi objek string
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus elemen
        strings.remove("praktikum");
		//iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+" ");
        }
        
    }
}