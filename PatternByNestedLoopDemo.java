/*
WAP to print following structure
      *
    * *
  * * *
* * * *

*/
public class PatternByNestedLoopDemo
{
	public static void main(String ar[])
	{
		for(int r=1 ; r<=4 ; r++) //row
		{
			for(int s=1 ; s<=4-r ; s++) //column
			{
				System.out.print("  ");
			}
			
			for(int c=1 ; c<=r ; c++) //column
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}