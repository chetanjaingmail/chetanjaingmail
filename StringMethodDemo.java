class StringMethodDemo
{
	public static void main(String args[])
	{
		String s1 = "Hello";
		System.out.println(s1.length()); //5
		System.out.println(s1.isEmpty()); //false
		System.out.println(s1.charAt(1)); //e
		System.out.println(s1.toUpperCase()); //HELLO
		System.out.println(s1.toLowerCase()); //hello
		System.out.println(s1);

		String s2 = " Java";
		String output = s1.concat(s2);
		System.out.println(output);//Hello Java
		System.out.println(s1);	//Hello	

		String s3 = "Hello Java String Demo";
		System.out.println(s3.substring(6)); //Java String
		System.out.println(s3.substring(6,14));//Java Str
		System.out.println(s3);

		String arr[] = s3.split(" ");
		//Demo String Java Hello
		for(int i = arr.length-1 ; i>=0 ; i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		char ch[] = s1.toCharArray();
		//olleH
		for(int i = ch.length-1 ; i>=0 ; i--){
			System.out.print(ch[i]);
		}
		System.out.println();

		String s4 = "String from Java String is a Class in Java";
		System.out.println(s4.replaceAll("Java","C++"));
		System.out.println(s4);

		System.out.println(s4.replace('a','z'));
		
	}
}