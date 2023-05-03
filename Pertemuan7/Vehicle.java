/*
	Nama  File	: Vehicle.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: Superclass yang digunakan untuk menghitung harga sewa kendaraan
*/

public class Vehicle {
    void calRent(int distance,float price){
        float fare=distance*price;
        System.out.println("Harga sewa kendaraan = "+fare);
    }
}
