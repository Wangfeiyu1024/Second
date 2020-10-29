# Second
JAVA第二次实验
# 计G201+2020322060+王菲钰
# 实验名称 
### 学生选课模拟系统
## 实验目的
1.掌握定义类中属性以及方法和面向对象的类设计  
2.了解Super()关键词以及使用实例化对象  
3.掌握类的继承关系，学会通过构造方法实例化对象  
4.掌握使用Object根类的tostring（）方法，并会在相关对象的信息输出中。  
## 实验要求
1.建立People类，并建立Teacher和Student类继承People类  
2.建立Course类，通过类名定义变量调用tostring（）方法输出  
3.建立测试类，实例化老师，学生，课程  
4.模拟学生选课操作、打印课程信息  
5.模拟学生退课操作，再打印课程信息  
## 实验过程
  ### 1.建立包 
  * 在包中设置People(人),Course（课程）,Student(学生）,Teacher（老师），主类Test    
  ### 2. People类
  * 属性：number（学工号），name（姓名），sex（性别）  
  * 方法：  
     1）给上述三个属性设置set()和get()方法  
     2）设置有参构造方法，并用this表示当前对象  
  ### 3. Course类
  * 属性：  
      1）普通属性    
      courseName（课程名），couradd（课程地址），courseId（课程号），card（学分），time（上课时间），state（选课状态）  
      2）特殊属性（用类名定义属性）  
      teacher和student,例如Teacher teacher  
  * 方法：  
      1）给上述各个属性设置set()和get()方法  
      2）设置有参构造方法，并用this表示当前对象  
      3）使用toString（）方法输出课程信息  
      4）设置在课程中加入学生addStudent（）和移除课程exitStudent（）方法。如果学生状态为1，即加入课程。状态为0，即退出课程  
 ### 4. Teacher类
  * 属性：  
      1）普通属性    
       level(级别）   
      2）特殊属性（用类名定义属性）    
       courses（Course courses） 
  * 方法：  
      1）给上述各个属性设置set()和get()方法    
      2）设置有参构造方法，并用this表示当前对象    
      3）使用toString（）方法输出老师相关信息    
      4）建立Teacher类时继承父类People  
      5)使用super（）方法调用父类的构造方法
 ### 4. Student类
  * 属性：   
      1）普通属性    
       classown(所属班级），major（所属专业），department（所属院系）  
       Coursenum（课数量），state（选课状态）   
      2）特殊属性（用类名定义属性）    
       courses（Course courses）   
  * 方法：  
      1）给上述各个属性设置set()和get()方法    
      2）设置有参构造方法，并用this表示当前对象    
      3）使用toString（）方法输出老师相关信息    
      4）建立Student类时继承父类People    
      5)使用super（）方法调用父类的构造方法  
      6)选课addCourse（）：学生的未选课初始状态都为0，判断学生状态是否大于等于0，是选择此课程，并把调用课程的         addStudent（）把学生加入课程中，状态改为1，输出课程信息  
      7）课容量MaxCourse():学生选上课即状态为1，状态大于等于1时，课程数量自加1且当大于等于1时，输出错误，每名学       生只能选择一门课  
      8）退课：exitCourse（）：当学生选上课（1），使用Scanner扫描用户输入，看是否退课（退课输入0，不退输入1），       如退课，将其的课程修改为null，并调用exitStudent（）移除学生，状态恢复到0       
  ### 6.Test类
  * 实例化对象：调用构造方法实例化老师，学生，课程   
     老师：tea0（刘源），tea1（王薇）  
     学生：stu0（王一），stu1（李尔）  
     课程：cour0（高数），cour1（数据库）
  * 调用toString（）方法输出学生信息  
  * 调用学生选课，测试课容量，退课方法
  ### 7.测试private 
  * 在其他类中调用私有变量temperature 
  * 在不同包调用私有方法 
## 核心方法
（1）设置属性
```
    Teacher teacher;
	  float card;         //学分
	  Student students;
```
（2）构造方法  
```
Student(int number, String name, String sex,String classown,String major,String department) {
		super(number, name, sex);
		this.department = department;
		this.classown = classown;
		this.major = major;
	} 
```
（3）set和get方法的建立  
```
public Student getStudents() {
		return students;
	}
	public void setStudents(Student students) {
		this.students = students;
	}
```
（4）super()方法调用父类有参构造方法      
```
 super(number, name, sex);
 ```
（5）toString() 方法打印对象信息      
```
public String toString() {
		return "学号:"+getNumber()+"  学生姓名:"+getName()+"   性别:"+getSex()+"   所属院    系:"+getDepartment()+"   所属班级:"+getClassown()+"  所属专业:"+getMajor();
	}
```
 (6)选课addCourse（）       
```
public void addCourse(Course courses){
	   if(state >= 0){
       this.courses = courses;
	       courses.addStudent(this);           //课程添加学生
	       state = 1;
       System.out.println(getName()+"选择 "+"("+getCourses()+")"+"课程成功");
	   }
	}
```
 (7)课容量MaxCourse（）         
```
public void MaxCourse(){
		 if(state >= 1) {
	       Coursenum = ++z;                  //选上课加1
	 		 if(Coursenum >= 1) {
	 		   System.out.println("错误，每名学生最多选一门课");
	 		 }
	      }
	}
```
(8)退课exitCourse（）         
```
@SuppressWarnings("resource")
	public void exitCourse(Course courses) {
		if(state == 1){
	      Scanner sc1=new Scanner(System.in);  // 创建Scanner对象  格式；Scanner [对象名]=new              Scanner(System.in);
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
```
(9)课程加入学生addStudent（）：判断状态等于1 ，则学生加入此课程           
```
public void addStudent(Student stu){
	    if(state == 1){
	       students = stu;
	     }
	}
```
(10)课程移除学生exitStudent（）：判断状态等于0 ，则学生退出此课程  
```
public void exitStudent(Student stu){
	    if(state == 0){
	       students = null;
	     }
	}
```
## 实验结果
### （1）stu0学生选择一门课程且不退课      
![alt console](http://m.qpic.cn/psc?/V528qTS74BHGMM1h1AFf33VeSW0R67RO/ruAMsa53pVQWN7FLK88i5l8uD2uUbnkdQYxnOi*guYUxP51BvOW343YpV.idtJ2rJugxDlQ.pGRzs2qzHN8Tun1XBD4guZxO8IGmnL.RN7g!/mnull&bo=kwXTAJMF0wADCSw!&rf=photolist&t=5)   
### （2）stu0学生选择两门课程且退课     
![alt console](http://m.qpic.cn/psc?/V528qTS74BHGMM1h1AFf33VeSW0R67RO/45NBuzDIW489QBoVep5mcXdRk29iXMQYszytWyLTluR1ninTUvu9xh1gjN3Q14ZWeREIpBP9CCqWcpI3pkMHDZ0nyWXJ0xamgbjkSo4TckE!/b&bo=PQVfAT0FXwEDGTw!&rf=viewer_4)     
## 实验感想
  通过此次试验掌握了通过类名定义变量,掌握了Super()关键词，使用它可继承父类的构造方法，并用来实例化对象，掌握类的继承关系，将人类与老师学生类连接起来，掌握tostring（）方法，并可通过对象输出相关信息。也会通过构造方法实例化对象。整体系统地学习了怎样把类与类之间建立联系，并会熟练通过使用这些方法和属性做出学生选课系统。  
