package sy22;

import java.util.Scanner;

class Student extends People{
	String classown;             //所在班级
    String major;
    String department;           //所属院系
    Course courses;              //使用课程类建立变量
    int Coursenum,z=0;               //课程数量
    int state,n;
	public String getClassown() {
		return classown;
	}
	public void setClassown(String classown) {
		this.classown = classown;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	}
	Student(int number, String name, String sex,String classown,String major,String department) {
		super(number, name, sex);
		this.department = department;
		this.classown = classown;
		this.major = major;
	}
	public String toString() {
		return "学号:"+getNumber()+"  学生姓名:"+getName()+"   性别:"+getSex()+"   所属院系:"+getDepartment()+"   所属班级:"+getClassown()+"  所属专业:"+getMajor();
	}
	//选课和每名学生最多选一门课
	public void addCourse(Course courses){
	   if(state >= 0){
       this.courses = courses;
	       courses.addStudent(this);           //课程添加学生
	       state = 1;
       System.out.println(getName()+"选择 "+"("+getCourses()+")"+"课程成功");
	   }
	}
	public void MaxCourse(){
		 if(state >= 1) {
	       Coursenum = ++z;                  //选上课加1
	 		 if(Coursenum >= 1) {
	 		   System.out.println("错误，每名学生最多选一门课");
	 		 }
	      }
	}
	//是否退课
	@SuppressWarnings("resource")
	public void exitCourse(Course courses) {
		if(state == 1){
	      Scanner sc1=new Scanner(System.in);  // 创建Scanner对象  格式；Scanner [对象名]=new Scanner(System.in);
                                            //scanner 是一个扫描对象   system.in 是控制台输入 这样就可以获得从控制台输入的参数了
          System.out.println("是否退课?退课输入0，不退输入1");  
        int n=sc1.nextInt();          // 只读取 整型 值，就是只能读取整数类型的数据  格式：[变量类型] [变量名]=[Scanner对象名].[根据变量类型判定];
        if(n == 0) {
          this.courses = null;
		  courses.exitStudent(this);           //课程添加学生
		  state = 0;
	      System.out.println(getName()+"退课成功"+"课程信息："+"("+getCourses()+")");
		  }
		}
	}
}

