/*
	Nama  File	: BujurSangkar.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 15 Maret 2023
	Deskripsi	: Representasi dari objek bujur sangkar, turunan kelas poligon
*/

package org.bangundatar;
import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
	}
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	public double getPanjangSisi(){
		return panjangSisi;
	}
}