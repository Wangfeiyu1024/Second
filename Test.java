package sy22;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu0 = new Student(2001,"��һ","��","��G201","�������ѧ�뼼��","��Ϣ����ѧԺ");
        Student stu1 = new Student(2002,"���","Ů","��G201","��е����","��е����ѧԺ");
        Teacher tea0= new Teacher(101,"��Դ","��","����");
        Course cour0 = new Course(02,"����","��104","9.40-11.05",tea0,4);
        Teacher tea1= new Teacher(101,"��ޱ","Ů","��ʿ");
        Course cour1 = new Course(03,"���ݿ�","��300","4.05-5.40",tea1,6);
        
        System.out.println(stu0);
        stu0.addCourse(cour0);
        stu0.exitCourse(cour0);
        
        System.out.println(stu1);
        stu1.addCourse(cour1);
        stu1.addCourse(cour0);
        stu1.MaxCourse();
        stu1.exitCourse(cour0);
	}
}
