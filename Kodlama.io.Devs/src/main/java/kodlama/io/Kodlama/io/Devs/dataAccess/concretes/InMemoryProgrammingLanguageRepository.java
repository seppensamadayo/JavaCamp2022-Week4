package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Repository

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
List<ProgrammingLanguage> programmingLanguages;

public InMemoryProgrammingLanguageRepository() {
	programmingLanguages=new ArrayList<ProgrammingLanguage>();
	programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
	programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
	programmingLanguages.add(new ProgrammingLanguage(3, "Python"));


}
@Override
public List<ProgrammingLanguage> getAll() {
	// TODO Auto-generated method stub
	return programmingLanguages;
}

@Override
public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        if (programmingLanguages.contains(new ProgrammingLanguage())) {
           throw new Exception("Language name cannot be repeated"); 
        } if (programmingLanguage.getLanguage()==" ") {
		throw new Exception("Language name cannot be empty");
	}else {
	System.out.print("Language is added");
}
}



@Override
public void delete(ProgrammingLanguage programmingLanguage) {
	// TODO Auto-generated method stub
	System.out.print("Language is deleted");
}

@Override
public void update(ProgrammingLanguage programmingLanguage) {
	// TODO Auto-generated method stub
	System.out.print("Language is updated");
}

@Override
public void list(ProgrammingLanguage programmingLanguage) {
	// TODO Auto-generated method stub
	System.out.print("Languages are listed");
}

@Override
public void getById(int id) {
	// TODO Auto-generated method stub
	System.out.print("Language is brought");
}
}
