package sy22;

class Teacher extends People {
    Course courses;
    String level;      //级别
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
		return "老师编号:"+getNumber()+";"+"老师姓名:"+getName()+";"+"性别:"+getSex()+";"+"级别:"+getLevel();
	}
}
