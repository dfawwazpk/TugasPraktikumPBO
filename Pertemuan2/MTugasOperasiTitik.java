/*
	Nama  File	: MTugasOperasiTitik.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 1 Maret 2023
	Deskripsi	: Main dari OperasiTitik
*/

class MTugasOperasiTitik{
	public static void main(String[] args){
		Titik t;
		TugasOperasiTitik op;
		t = new Titik(4,4);
		op = new TugasOperasiTitik();
		
		System.out.println("Titik ("+t.getAbsis()+", "+t.getOrdinat()+")");
		op.refleksiX(t);
		System.out.println("Titik setelah refleksi sumbu X ("+t.getAbsis()+", "+t.getOrdinat()+")");
		op.refleksiY(t);
		System.out.println("Titik setelah refleksi sumbu X ("+t.getAbsis()+", "+t.getOrdinat()+")");
	}
}