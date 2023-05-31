import java.beans.IndexedPropertyChangeEvent;
import java.util.concurrent.ExecutionException;

/*
	Nama  File	: PersonDAO.java
	Pembuat		: Dimas Fawwaz Prabowo Kusumaji
	NIM			: 24060121140035
	Tanggal		: Rabu, 31 Mei 2023
	Deskripsi	: Interface untuk person access object
*/

public interface PersonDAO {
    public void savePerson(Person P) throws Exception;
}
