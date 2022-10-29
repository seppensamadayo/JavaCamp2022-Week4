package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void delete(ProgrammingLanguage programmingLanguage);
	void update(ProgrammingLanguage programmingLanguage);
	void list(ProgrammingLanguage programmingLanguage);
	ProgrammingLanguage findById(int id);
	
}
