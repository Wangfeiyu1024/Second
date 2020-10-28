package sy22;

public class People {
	int number;
    String name;
    String sex;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	People( int number,String name,String sex){
		this.number = number;
		this.name = name;
		this.sex = sex;
	}
}

