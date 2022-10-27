package kodlama.io.kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	void create(ProgrammingLanguage programmingLanguage);
	void update(ProgrammingLanguage programmingLanguage);
	void delete(int id);
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
}
