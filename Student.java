package sy22;

import java.util.Scanner;

class Student extends People{
	String classown;             //���ڰ༶
    String major;
    String department;           //����Ժϵ
    Course courses;              //ʹ�ÿγ��ཨ������
    int Coursenum,z=0;               //�γ�����
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
		return "ѧ��:"+getNumber()+"  ѧ������:"+getName()+"   �Ա�:"+getSex()+"   ����Ժϵ:"+getDepartment()+"   �����༶:"+getClassown()+"  ����רҵ:"+getMajor();
	}
	//ѡ�κ�ÿ��ѧ�����ѡһ�ſ�
	public void addCourse(Course courses){
	   if(state >= 0){
       this.courses = courses;
	       courses.addStudent(this);           //�γ����ѧ��
	       state = 1;
       System.out.println(getName()+"ѡ�� "+"("+getCourses()+")"+"�γ̳ɹ�");
	   }
	}
	public void MaxCourse(){
		 if(state >= 1) {
	       Coursenum = ++z;                  //ѡ�Ͽμ�1
	 		 if(Coursenum >= 1) {
	 		   System.out.println("����ÿ��ѧ�����ѡһ�ſ�");
	 		 }
	      }
	}
	//�Ƿ��˿�
	@SuppressWarnings("resource")
	public void exitCourse(Course courses) {
		if(state == 1){
	      Scanner sc1=new Scanner(System.in);  // ����Scanner����  ��ʽ��Scanner [������]=new Scanner(System.in);
                                            //scanner ��һ��ɨ�����   system.in �ǿ���̨���� �����Ϳ��Ի�ôӿ���̨����Ĳ�����
          System.out.println("�Ƿ��˿�?�˿�����0����������1");  
        int n=sc1.nextInt();          // ֻ��ȡ ���� ֵ������ֻ�ܶ�ȡ�������͵�����  ��ʽ��[��������] [������]=[Scanner������].[���ݱ��������ж�];
        if(n == 0) {
          this.courses = null;
		  courses.exitStudent(this);           //�γ����ѧ��
		  state = 0;
	      System.out.println(getName()+"�˿γɹ�"+"�γ���Ϣ��"+"("+getCourses()+")");
		  }
		}
	}
}

