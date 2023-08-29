class Main
{
	public static void main(String[]args)
	{
	String health="excellent",location="city",gender="female";
	int age=34;
	double premium=0,policy_amount=1000000,max_amount=0;
	if(health=="excellent"&&(age>=25&&age<=35)&&location=="city")
	{
	if(gender=="male"&&policy_amount<=200000)
	{
	premium=4.0*policy_amount/1000;
	max_amount=4.0*200000/1000;
	}
	else if(gender=="female"&&policy_amount<=100000)
	{
	premium=3.0*policy_amount/1000;
	max_amount=3.0*100000/1000;
	}
	else
	{
	System.out.println("PERSON_NOT_INSURED");
	}
	}
	else if(health=="poor"&&(age>=25&&age<=35)&&location=="village"&&gender=="male"&&policy_amount>=10000)
	{
	premium=6.0*policy_amount/1000;
	max_amount=6.0*10000/1000;
	}
	else
	{
	System.out.println("person_not_insured");
	}
	double loss=max_amount-premium;
	System.out.println(premium+"  "+max_amount+"  "+loss);
	}
	}