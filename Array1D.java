class Array1D
{
	public static void main(String arr[])
	{
		/*double salary[]; //declaration
		salary = new double[5]; // Instance
		System.out.println(salary);*/



		//double salary[] = new double[5];

		/*salary [0] = 23423.54; //inititaliztion 
		salary [1] = 65754.54;
		salary [2] = 65867.54;
		salary [3] = 32654.54;
		salary [4] = 96754.54;*/


		//double salary[] = new double[]{23423.54, 65754.54, 65867.54, 32654.54, 96754.54};

		double salary[] = {23423.54, 65754.54, 65867.54, 32654.54, 96754.54};

		/*System.out.println(salary[0]);
		System.out.println(salary[1]);
		System.out.println(salary[2]);
		System.out.println(salary[3]);
		System.out.println(salary[4]);*/

		
		//System.out.println(salary.length);

		/*for(int i = 0 ; i<=salary.length ; i++)
		{
			System.out.println(salary[i]);
		}*/

		for(double sal : salary)
		{
			System.out.println(sal);
		}

		//================Max Salary==========
		double max = 0.0;
		for(double sal : salary)
		{
			if(sal>max){
				max = sal;
			}
		}
		System.out.println("max salary is : "+max);

	}

}