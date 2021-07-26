/*
	Print a day for given int value
	Ex: 	1 - Monday
		2 - Tuesday
		.
		.
		7 - Sunday 
*/
public class ElseIfDemo
{
	public static void main(String ar[])
	{
		int day = 10;
		final int a = 2;
		switch(day)
		{
			case 1:{
				System.out.println("Mon");
				break;
			}
			case a:{
				System.out.println("Tues");
				break;
			}
			default:{
				System.out.println("Invalid Case");
				break;
			}
			case 3:{
				System.out.println("Wed");
				break;
			}
			case 4:{
				System.out.println("Thus");
				break;
			}
			case 5:{
				System.out.println("Fri");
				break;
			}
			case 6:{
				System.out.println("Sat");
				break;
			}
			case 7:{
				System.out.println("Sun");
				break;
			}	
		}
	}
}