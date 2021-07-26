class CalculateDemo
{
	int ans=1000;
	public static void main(String ar[])
	{
		int a = 10, b=20;
		Calculate cal;
		cal = new Calculate();
		System.out.println(cal);
		cal.add(a,b);
	}
	public void add(int x, int y)
	{
		int ans = x+y;
		System.out.println(ans);
		return;
	}
}