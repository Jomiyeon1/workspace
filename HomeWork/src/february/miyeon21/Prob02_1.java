package february.miyeon21;

class Info{
	//Field
	private String name;
	private int age;
	//constructor
	public Info(){
		
	}

	public Info(String name){
		this.name = name;
	}
	public Info(int age){
		this.age = age;
	}
		public Info(String name, int age){
		this.name = name;
		this.age = age;
	}
	//setter
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}

	//getter
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}


}//end of Info class

class Student extends Info{
	private int id;
	
	public Student(){
		super();
	}
	public Student(String name, int age, int id){
		super(name, age);
		this.id = id;
	}

	//setter
	public void setId(int id){
		this.id = id;
	}
	//getter
	public int getId(){
		return id;
	}

	//���
	public void print(){
		System.out.println("�̸�: " +getName() + "\t ��   �� : " + getAge() + "\t ��   �� :" + getId());
	}

}//end of Student
//=========================================
class Teacher extends Info{
	private String subject;

	public Teacher(){
		super();
	}

	public Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	//setter
	public void setSubject(String subject){
		this.subject = subject;
	}
	//getter
	public String getSubject(){
		return subject;
	}



	public void print(){
		System.out.println("�̸�: " +getName() + "\t ��   �� : " + getAge() + "\t ��   �� :" + getSubject());
	}

}//end of Teacher class

class Employee extends Info{
	private String dept = null;

	public Employee(){
		super();
	}

	public Employee(String name, int age, String dept){
		super(name, age);
		this.dept = dept;
	}

	//setter
	public void setDept(String dept){
		this.dept = dept;
	}
	//getter
	public String getDept(){
		return dept;
	}


	public void print(){
		System.out.println("�̸�: " +getName() + "\t ��   �� : " + getAge() + "\t ��   �� :" + getDept());
	}


}// end of class



public class Prob02_1{
	//main
	public static void main(String[] args){
		
		Student s = new Student("ȫ�浿", 20, 200201);
		Teacher t = new Teacher("�̼���", 30, "JAVA");
		Employee e = new Employee("������", 40, "������");

		s.print();
		t.print();
		e.print();
	}
}//end of class