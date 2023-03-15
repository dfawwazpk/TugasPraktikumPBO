/*
	Nama  File	: MKubus.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 15 Maret 2023
	Deskripsi	: Driver class untuk kubus
*/

package org.main;
import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar persegi = new BujurSangkar(4);
		Kubus kubus = new Kubus(persegi);
		System.out.println("Volume Kubus : "+kubus.hitungVolume());
		System.out.println("Luas Alas Kubus : "+kubus.hitungLuasAlas());
	}
}