package kodlama.io.kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {
	
	private int Id;
	private String name;
	
	public ProgrammingLanguage() {

	}

	public ProgrammingLanguage(int id, String name) {

		Id = id;
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
