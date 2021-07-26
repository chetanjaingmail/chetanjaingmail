class Array2D
{
	public static void main(String arr[])
	{
		int studSub[][] = {{78,67,89,78,90},{76,89,19,67,67},{89,86,89,76,45},{89,88,77,66,55}};

		System.out.println(studSub.length); //4
		System.out.println(studSub[1].length);//5

		for(int stud[] : studSub) // Row
		{
			for(int mark : stud) //Column
			{
				System.out.print(mark+"\t");
			}
			System.out.println();
		}
	}
}
