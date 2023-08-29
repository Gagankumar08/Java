class Main
{
	public static void main(String[]args)
	{
	double a=643;
	double b=Math.sqrt(a);
	String root=String.format("%.3f",b);
	System.out.println(root);
	if (a%b==0)
	{
	System.out.println("perfect root");
	}
	else
	{
	System.out.println("not perfect root");
	}
	}
}