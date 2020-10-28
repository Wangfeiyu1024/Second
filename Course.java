package sy22;

public class Course {
	  String courseName;
	  String couradd;     //上课地点
	  int courseId;
	  Teacher teacher;
	  float card;         //学分
	  Student students;
	  String time;        //上课时间
	  int state;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCouradd() {
		return couradd;
	}
	public void setCouradd(String couradd) {
		this.couradd = couradd;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public float getCard() {
		return card;
	}
	public void setCard(float card) {
		this.card = card;
	}
	public Student getStudents() {
		return students;
	}
	public void setStudents(Student students) {
		this.students = students;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	Course( int courseId,String courseName, String couradd,String time,Teacher teacher,float card){
		this.courseName = courseName;
		this.couradd = couradd;
		this.courseId = courseId;
		this.time = time;
		this.card = card;
		this.teacher = teacher;
	}
	public String toString() {
		return "上课编号:"+getCourseId()+";"+"课程名称:"+getCourseName()+";"+"上课地点:"+getCouradd()+"上课时间:"+getTime()+";"+"学时:"+getCard()+";"+"\n"+"	授课教师:"+getTeacher()+";";
	}
	public void addStudent(Student stu){
	    if(state == 1){
	       students = stu;
	     }
	}
	public void exitStudent(Student stu){
	    if(state == 0){
	       students = null;
	     }
	}
}
