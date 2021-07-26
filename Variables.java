public class Variables
{
	int p = 20;
	static boolean q;
	public static void main(String ar[])
	{
		byte a=10;
		a = (byte)(a + 1);
		System.out.println(a);

		byte b = 10;
		int z = b;
		System.out.println(z);

		System.out.println("====================");
		int binary = 0B0101;
		System.out.println(binary);
		int octal = 027;
		System.out.println(octal);				
		int hexa = 0xCAFE;
		System.out.println(hexa);

		System.out.println("====================");
		System.out.println(q);		
	}
}