/*
WAP to print following structure
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/

public class NestedLoopDemo
{
	public static void main(String ar[])
	{
		for(int r=1 ; r<=4 ; r++) //row
		{
			for(int c=1 ; c<=5 ; c++) //column
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}