public class Dog1 {
	private String name;
	private String breed;
	private int age;
	private Gender1 gen;
	
	public Dog1() {
		this(null, null, -1, Gender1.UNASSIGNED);
	}

	public Dog1(String name, String breed, int age, Gender1 gen) {
		setName(name);
		setBreed(breed);
		setAge(age);
		setGender(gen);
	}

	public void setName(String name) {
		if(name != null) {
			this.name = name;
		}else {
			if(this.name == null) {
				this.name = "Unknown";
			}
		}
	}
	
	public void setGender(Gender1 gen) {
		this.gen = gen;
	}
	
	public void setGender(char gen) {
		if(gen=='M') {
			setGender(Gender1.MALE);
		}else if(gen=='F') {
			setGender(Gender1.FEMALE);
		}else {
			setGender(Gender1.UNASSIGNED);
;		}
	}
	
	public void setBreed(String breed) {
		if(breed != null) {
			this.breed = breed;
		}else {
			if(this.breed == null) {
				this.breed = "Unknown";
			}
		}
	}
	
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		}else {
			this.age = -1;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getGender() {
		return gen.toString();
	}
	
	public String toString() {
		return "Name: " + getName() + ", Breed: " + getBreed() +
				", Age: " + getAge() + ", Gender: " + getGender();
	}
	
//	public String getDetails() {
//		String result = "Name: " + getName() + ", Breed: " + getBreed() +
//				", Age: " + getAge() + ", Gender: " + getGender();
//		return result;
//	}
//	
//	public String toString() {
//		return getDetails();
//	}

}
