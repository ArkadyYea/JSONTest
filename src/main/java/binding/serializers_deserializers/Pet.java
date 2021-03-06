package binding.serializers_deserializers;

public abstract class Pet {
    
	private String name;
    private int age;
    private Boolean furry;
	
    public Pet() {}
    
	public Pet(String name, int age, Boolean furry) {
		this.name = name;
		this.age = age;
		this.furry = furry;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Boolean getFurry() {
		return furry;
	}
	public void setFurry(Boolean furry) {
		this.furry = furry;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", furry=" + furry + "]";
	}
    
}