class Main 
{
	public static void main(String args[])
	{
	char one='$';
	if(one>=65 && one<=90)
	{
	if(one=='A'||one=='E'||one=='I'||one=='O'||one=='U')
	System.out.println("VOWELS");
	else
	{
	System.out.println("consonants");
	}}	
	else if(one>=97 && one<=122)
	{
	if(one=='a'||one=='e'||one=='i'||one=='o'||one=='u')
	System.out.println("vowels");
	else
	System.out.println("consonants");
	}
	else if(one>='0'&&one<='9')
	{
	System.out.println("numbers");
	}
	else
	{
	System.out.println("symbols");
	}
	}
}
	

	