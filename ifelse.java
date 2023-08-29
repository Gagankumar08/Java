class Main
{
	public static void main(String[]args)
	{
	  String name=("book");
	  int code=1204;
	  int price=1500;
	  int quantity=2;
	  double total=price*quantity;
	  System.out.println("total="+total);
	  if(total>2000)
	  {
	  double dis=10/100.0*total;
	  System.out.println("dis="+dis);
	  }
	  else
	  {
	  double dis=5/100.0*total;
	  System.out.println("dis="+dis);
	  }
	}
}
	
	

	