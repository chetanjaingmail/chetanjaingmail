/*
	Declare a percentage of student and Identify the Grade
	100-70 - Distinction
	60-70 - 1st Class
	50-59 - 2nd Class
	40-49 - Pass Class
	0-39 - Fail 
*/
public class IfDemo
{
	public static void main(String ar[])
	{
		int percent = 300;
		if(percent>=40 && percent<=100){
			System.out.print("Congrates!!! You got ");
			if(percent>=70 && percent<=100){
				System.out.println("Distinction");			
			}else if(percent>=60 && percent<=69){
				System.out.println("1st Class");		
			}else if(percent>=50 && percent<=59){
				System.out.println("2nd Class");		
			}else{
				System.out.println("Pass Class");		
			}
		}else if(percent>=0 && percent<=39){
			System.out.println("Fail");
		}else{
			System.out.println("Invalid Percentage..");
		}
	}
}