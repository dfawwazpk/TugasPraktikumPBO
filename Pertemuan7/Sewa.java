/*
	Nama  File	: Sewa.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: Main dari Vehicle
*/

public class Sewa {
    public static void main(String[] args){
        Vehicle kendaraan=new Vehicle();
        Vehicle mobil=new Car();
        Vehicle bis=new Bus();
        kendaraan.calRent(50,1000);
        mobil.calRent(50,1000);
        bis.calRent(50,1000);
    }
}
