/*
	Nama  File	: Car.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: Subclass dari Vehicle yang digunakan untuk menghitung biaya sewa mobil
*/

public class Car extends Vehicle{
    void calRent(int jarak,float harga){
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("Harga sewa mobil = "+fare);
    }
}
