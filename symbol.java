class Main
{
	public static void main(String args[])
	{
	char num='1';
	if(num>=65&&num<=90)
	if(num=='A'||num=='E'||num=='I'||num=='O'||num=='U')
	{
	System.out.println("VOWELS");
	}
	else
	{
	System.out.println("CONSONANT");
	}
	else if(num>=97&&num<=122)
	if(num=='a'||num=='e'||num=='i'||num=='o'||num=='u')
	{
	System.out.println("vowels");
	}
	else
	{
	System.out.println("consonant");
	}
	else if(num>='0'&&num<='9')
	{
	System.out.println("numbers");
	}
	else
 	{
	System.out.println("symbols");
	}
	}
}
	