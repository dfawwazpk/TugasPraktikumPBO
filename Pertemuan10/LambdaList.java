import java.util.ArrayList;

/*
	Nama  File	: LambdaList.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 31 Mei 2023
	Deskripsi	: Implementasi lambda pada List, digunakan sebagai parameter pada method
*/

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
