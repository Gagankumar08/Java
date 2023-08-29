class SI
{
	public static void main(String[]args)
	{
	int p=30,t=10,r=15;
	int si=p*t*r/100;
	System.out.println("simple_intrest="+si);
	double a=(1+r/100);
	System.out.println("a="+a);
	double h=Math.pow(a,t);
	System.out.println("h="+h);
	a=p*h;
	System.out.println("a="+a);
	double ci=a-p;
	System.out.println("compound_intrest="+ci);
	}
}
	