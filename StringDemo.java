class StringDemo
{
	public static void main(String arr[])
	{
		String s1 = "Hello";
		String s2 = new String("Hello");

		String s3 = "Hello";
		String s4 = new String("Hello");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	
		System.out.println(s1 == s2);	//false	
		System.out.println(s1 == s3);	//ture
		System.out.println(s2 == s4);	//false
	
		System.out.println(s1 == "Hello");	// true
		System.out.println(s2 == "Hello");	//false
		System.out.println(s3 == "HELLO");	//false


		System.out.println(s1.equals(s2));	//ture
		System.out.println(s1.equals(s3));	//ture
		System.out.println(s2.equals(s4));	//ture
	} 
}