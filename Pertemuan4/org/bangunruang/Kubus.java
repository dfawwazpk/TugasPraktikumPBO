/*
	Nama  File	: Kubus.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 15 Maret 2023
	Deskripsi	: Representasi dari objek , turunan kelas poligon
*/

package org.bangunruang;
import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi * panjangSisi;
	}
	public double hitungLuasAlas(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi;
	}
}