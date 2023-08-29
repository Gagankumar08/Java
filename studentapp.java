class Main
{
	public static void main(String[]args)
	{
	String name=("gagan");
	char section='a';
	int scholarship=0,donation=0,fee=74000;
	int roll =33;
	int s1=35,s2=40,s3=60,s4=80,s5=75,s6=85;
	int total=s1+s2+s3+s4+s5+s6;
	System.out.println("total="+total);
	double percentage=total/600.0*100;
	System.out.println("percentage="+percentage);
	if (percentage>80)
	{
	section='A';
	scholarship=10000;
	donation=0;
	String grade="DISTINCTION";
	}
	else
	{
	section='b';
	scholarship=0;
	donation=15000;
	String grade="FAIL";
	}
	fee=fee+donation-scholarship;
	System.out.println("total_fee="+fee);
	}
}