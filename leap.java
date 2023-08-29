class Year
{
	public static void main(String[]args)	
	{
	int a=2023;
	if((a%4==0&&a%400==0)||a%100!=0)
	{
	System.out.println("leap year");
	}
	else
	{
	System.out.println("not a leap year");
	}
	}
}