import java.util.HashMap;
import java.util.Map;
/*
    Nama File   : LambdaHashmap.java
    Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Selasa, 6 Juni 2023
    Deskripsi   : Implementasi Lambda pada Hashmap, digunakan sebagai parameter pada method
*/

public class LambdaHashmap 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put(695947, "Adi");
        mahasiswaMap.put(521024, "Bambang");
        mahasiswaMap.put(189677, "Cici");
        mahasiswaMap.put(439908, "Didi");
        mahasiswaMap.put(648379, "Eko");
        mahasiswaMap.put(115491, "Farhan");
        mahasiswaMap.put(378302, "Guntur");
        mahasiswaMap.put(275294, "Heru");
        mahasiswaMap.put(867324, "Ikmal");
        mahasiswaMap.put(520377, "Jono");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}