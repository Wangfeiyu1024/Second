package sy22;

public class Course {
	  String courseName;
	  String couradd;     //�Ͽεص�
	  int courseId;
	  Teacher teacher;
	  float card;         //ѧ��
	  Student students;
	  String time;        //�Ͽ�ʱ��
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
		return "�Ͽα��:"+getCourseId()+";"+"�γ�����:"+getCourseName()+";"+"�Ͽεص�:"+getCouradd()+"�Ͽ�ʱ��:"+getTime()+";"+"ѧʱ:"+getCard()+";"+"\n"+"	�ڿν�ʦ:"+getTeacher()+";";
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
