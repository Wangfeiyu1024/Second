package sy22;

class Teacher extends People {
    Course courses;
    String level;      //����
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	Teacher(int number, String name, String sex,String level) {
		super(number, name, sex);
		this.level = level;
	}
	public String toString() {
		return "��ʦ���:"+getNumber()+";"+"��ʦ����:"+getName()+";"+"�Ա�:"+getSex()+";"+"����:"+getLevel();
	}
}
