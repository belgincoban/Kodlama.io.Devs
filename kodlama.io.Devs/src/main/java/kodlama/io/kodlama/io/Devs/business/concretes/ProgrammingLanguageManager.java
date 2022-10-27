package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public void create(ProgrammingLanguage programmingLanguage) throws Exception {
	
		if (programmingLanguage.getName() !=null) {
			for (ProgrammingLanguage language : languageRepository.getAll()) {
				if (language.getName().equalsIgnoreCase(programmingLanguage.getName())) {
					throw new Exception("Aynı isimde programlama dili eklenemez!");
				}
			}
			languageRepository.create(programmingLanguage);
		}
		else {
			throw new Exception("Programlama dili boş geçilemez!");
		}
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		languageRepository.update(programmingLanguage);
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return languageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {

		return languageRepository.getById(id);
	}

}
