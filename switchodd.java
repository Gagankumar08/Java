class Main
{
	public static void main(String[]args)
        {
	int x=1,n=50;
	while(x<=n)
	{
	if(x%2==0)
	{
	n=n+x;
	System.out.println("sum");
	}
	else
	{
	n=n*x;
	System.out.println("multi");
	x++;
	}
	}
	}
}
	