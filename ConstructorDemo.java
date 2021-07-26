class ConstructorDemo{
	public static void main(String arr[]){
		Student s1 = new Student(1, "Abc", "8978678678");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getContact());
		System.out.println("=========================");
		Student s2 = new Student("Xyz", "89945546456");
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println(s2.getContact());
	}
}

class Student{
	private int id;
	private String name;
	private String contact;

	public Student(int i, String n, String c){
		id = i;
		name = n;
		contact = c;
	}

	public Student(String n, String c){
		name = n;
		contact = c;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getContact(){
		return contact;
	}
}