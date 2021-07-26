class SingleInheritance{
	public static void main(String arr[]){
		Stud s1 = new Stud();
		s1.degree = "BE";
		s1.id=12;
		s1.name = "Abc";
		s1.age = 23;

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.degree);
	}	
}
class Person{
	String name;
	int age;
	public Person(){
		System.out.println("Hi I am Person..");
	}
}

class Stud extends Person{
	String degree;
	int id;
	public Stud (){
		super();
		System.out.println("Hi I am Student..");
	}
}

class Emp extends Person{
	double salary;
	String companyName;
}