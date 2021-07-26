public class Encapsulation{
	public static void main(String arr[])
	{	
		Employee emp1 = new Employee();

		emp1.setId(123);
		emp1.setName("Abc");
		emp1.setAge(30);
		emp1.setSalary(23453.50); 

		emp1.printEmployeeData();
		
	}
}

class Employee{
	private int empId;
	private String name;
	private int age;
	private double salary;

	public int getId(){
		return empId;
	}	

	public void setName(String n){
		name = n.toUpperCase();
	}

	public void setAge(int a){
		if(a>=25 && a<=60){
			age = a;
		}else{
			System.out.println("Invalid Age");
			System.exit(0);
		}
	}

	public void setSalary(double s){
		salary = s;
	}

	public void printEmployeeData()
	{
		System.out.println("Id : "+empId);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}	
}