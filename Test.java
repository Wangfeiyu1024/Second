package sy22;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu0 = new Student(2001,"王一","男","计G201","计算机科学与技术","信息工程学院");
        Student stu1 = new Student(2002,"李尔","女","机G201","机械制造","机械工程学院");
        Teacher tea0= new Teacher(101,"刘源","男","教授");
        Course cour0 = new Course(02,"高数","教104","9.40-11.05",tea0,4);
        Teacher tea1= new Teacher(101,"王薇","女","博士");
        Course cour1 = new Course(03,"数据库","教300","4.05-5.40",tea1,6);
        
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
