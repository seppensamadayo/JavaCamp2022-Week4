package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
private ProgrammingLanguageRepository programmingLanguageRepository;
@Autowired
public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
	super();
	this.programmingLanguageRepository = programmingLanguageRepository;
}
@Override
public List<ProgrammingLanguage> getAll() {
	// TODO Auto-generated method stub
	return programmingLanguageRepository.getAll();
}
@Override
public void add(ProgrammingLanguage programmingLanguage) {
	// TODO Auto-generated method stub
	
}
@Override
public void delete(ProgrammingLanguage programmingLanguage) {
	// TODO Auto-generated method stub
	
}
@Override
public void update(ProgrammingLanguage programmingLanguage) {
	// TODO Auto-generated method stub
	
}

@Override
public ProgrammingLanguage findById(int id) {
	// TODO Auto-generated method stub
	return programmingLanguageRepository.findById(id);

}
}
