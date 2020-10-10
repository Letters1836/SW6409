package primary;

public class Patient {
	
	int id;
	String name;
	int age;
	int weight;
	String doctor;

	public Patient(int id, String name, int age, int weight, String doctor) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.doctor = doctor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
