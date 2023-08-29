class fizzbuzz
{
	public static void main(String[]args)
	{
	int n=27;
	if(n%5==0)
	{
	if(n%3==0)
	{
	System.out.println("fizzbuzz");
	}
	}
	else if(n%3==0)
	{
	System.out.println("fizz");
	}
	else if(n%5==0)
	{
	System.out.println("buzz");
	}
	else
	{
	System.out.println("not");
	}
	}
}