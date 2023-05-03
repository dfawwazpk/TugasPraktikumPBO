/*
	Nama  File	: Lingkaran.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: Lingkaran
*/

 import static java.lang.Math.PI;
 
 class Lingkaran implements IArea{
	private double jariJari;
	
	public Lingkaran(double r){
		jariJari = r;
	}
	
	public double hitungLuas(){
		return PI* jariJari * jariJari;
	}
 }
 
 