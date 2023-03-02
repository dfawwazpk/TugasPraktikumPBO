/*
	Nama  File	: TugasOperasiTitik.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Kamis, 2 Maret 2023
	Deskripsi	: Tugas Pertemuan 2
*/

class TugasOperasiTitik{
	public TugasOperasiTitik(){
	}
	private Titik refleksiSumbuX(Titik a){
		float y;
		y=a.getOrdinat();
		y=(-1)*y;
		a.setOrdinat(y);
		return a;
	}
	private Titik refleksiSumbuY(Titik a){
		float x;
		x=a.getAbsis();
		x=(-1)*x;
		a.setAbsis(x);
		return a;
	}
	public Titik refleksiX(Titik titik){
		return refleksiSumbuX(titik);
	}
	public Titik refleksiY(Titik titik){
		return refleksiSumbuY(titik);
	}
}