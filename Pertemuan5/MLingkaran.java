/*
	Nama  File	: MLingkaran.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: Main dari Lingkaran
*/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan panjang jari-jari lingkaran : ");
		double jariJari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jariJari);
		System.out.println("Luas lingkaran dengan "+
			"jari-jari "+jariJari+" satuan adalah "+l.hitungLuas());
	}
 }
  