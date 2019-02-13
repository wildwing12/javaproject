package ch21;

public class HealthDTO {
	private String id; 
	private String name; 
	private int age;
	private double height; 
	private double weight; 
	private double bmi;
	
	protected String getId() {
		return id;
	}
	protected void setId(String id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected double getHeight() {
		return height;
	}
	protected void setHeight(double height) {
		this.height = height;
	}
	protected double getWeight() {
		return weight;
	}
	protected void setWeight(double weight) {
		this.weight = weight;
	}
	protected double getBmi() {
		return bmi;
	}
	protected void setBmi(double bmi) {
		this.bmi = bmi;
	}
	@Override
	public String toString() {
		return "HealthDTO [id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ ", bmi=" + bmi + "]";
	}
	public HealthDTO(String id, String name, int age, double height, double weight, double bmi) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
	}
	public HealthDTO() {
	}
	
	
}
