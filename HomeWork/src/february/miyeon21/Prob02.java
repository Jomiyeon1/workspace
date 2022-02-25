package february.miyeon21;

// private�� �ٲٰ�, setter/getter ������ ��.

class Student{
	//Field
	private String name;
	private int age;
	private int id;

	//Constructor
	public Student(){
		
	}
	public Student(String name){
		this.name = name;
	}
	public Student(int age){
		this.age = age;
	}
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	} //
	public Student(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public void print(){
		System.out.println("�̸�: " +name + " ���� : " + age + " ��   �� :" + id);
	}

}//end of Student

//=====================
class Teacher{
	//Field
	private String name;
	private int age;
	private String subject;

	//Constructor
	public Teacher(){
		
	}
	public Teacher(String name){
		this.name = name;
	}
	public Teacher(int age){
		this.age = age;
	}
	public Teacher(String name, int age){
		this.name = name;
		this.age = age;
	} //
	public Teacher(String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	public void print(){
		System.out.println("�̸�: " +name + " ���� : " + age + " ��� ����:" + subject);
	}

}//end of Student

class Employee{
	//Field
	private String name;
	private int age;
	private String dept;
		
	public Employee(){
		
	}

	public Employee(String name, int age, String dept){
		this.name = name;
		this.age = age;
		this.dept = dept;
		
	}	

	public void print(){
		System.out.println("�̸�: " +name + " ���� : " + age + " ��   �� : " + dept);
	}
}


//=============================================
public class Prob02{
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