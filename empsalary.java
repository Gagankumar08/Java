class Main
{
	public static void main(String[]args)
	{
	String name="gagan";
	double basic_salary=25000,total_salary,gross_salary,pf,tax;
	double ta=15.0/100*basic_salary;
	double da=12.0/100*basic_salary;
	double hra=19.0/100*basic_salary;
	total_salary=basic_salary+ta+da+hra;
	System.out.println("total_salary="+total_salary);
	if (total_salary>40000)
	{
	pf=11/100*basic_salary;
	tax=5/100*basic_salary;
	}
	else
	{
	pf=7/100*basic_salary;
	tax=2.5/100*basic_salary;
	}
	gross_salary=total_salary-pf-tax;
	double total=12*gross_salary;
	double per_day=total/365;
	System.out.println("gross_salary_for_one_month="+gross_salary);
	System.out.println("total="+total);
	System.out.println("per_day="+per_day);
	}
}