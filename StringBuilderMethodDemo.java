class StringBuilderMethodDemo
{
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("Hello Java");
		System.out.println(sb);
		sb.append(" Program");
		System.out.println(sb);//Hello Java Program
		sb.insert(10,"8");
		System.out.println(sb);//Hello Java8 Program
		sb.delete(0,6);
		System.out.println(sb);//Java8 Program
		sb.reverse();
		System.out.println(sb);//margorP 8avaJ
		
	}
}