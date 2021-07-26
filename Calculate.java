class Calculate
{
	int ans=1000;
	public static void main(String ar[])
	{
		int a = 10, b=20;
		Calculate cal;
		cal = new Calculate();
		cal.add(a,b);
		int subAns = cal.sub(23,3);
		System.out.println(subAns);
		cal.mul();
		System.out.println(cal.div());
	}
	public void add(int x, int y)
	{
		int ans = x+y;
		System.out.println(ans);
		return;
	}
	protected int sub(int x, int y)
	{
		int ans = x-y;
		return ans;
	}
	void mul()
	{
		int p=10, q=3;
		System.out.println(p*q);
	}
	private double div()
	{
		int p=10, q=3;
		return p/q;
	}
}