/*
	Nama  File	: AngkaSialException.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("Jangan memasukkan angka 13 karena angka sial!");
	}
 }