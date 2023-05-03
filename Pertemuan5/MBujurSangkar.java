/*
	Nama  File	: MBujurSangkar.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 3 Mei 2023
	Deskripsi	: Main dari Bujur Sangkar
*/

import java.util.Scanner;

public class MBujurSangkar{
	public static void main(String[] args){
		BujurSangkar bs = new BujurSangkar();
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan panjang sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+
					" satuan adalah "+bs.hitungLuas(sisi));
	}
}
 
 
 