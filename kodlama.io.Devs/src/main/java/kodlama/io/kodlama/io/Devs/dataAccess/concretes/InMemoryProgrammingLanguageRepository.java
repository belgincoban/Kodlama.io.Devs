package kodlama.io.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;


@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages=new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
		programmingLanguages.add(new ProgrammingLanguage(4,"Kotlin"));
	}
	
	@Override
	public void create(ProgrammingLanguage programmingLanguage) {
		
		 programmingLanguages.add(programmingLanguage);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		 for (ProgrammingLanguage language : programmingLanguages) {
	            if (language.getId() == programmingLanguage.getId()){
	                language.setName(programmingLanguage.getName());
	            }
	        }
	}

	@Override
	public void delete(int id) {
		
		ProgrammingLanguage language=getById(id);
		programmingLanguages.remove(language);
		
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;
	}

	
}
