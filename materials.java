class Materials
{
	public static void main(String[]args)
	{
	    String proporties_names=("construction materials");
	    System.out.println(proporties_names);
	    int project_budget=700000;
	    System.out.println("project_budget="+ project_budget);
	    String material_name1="brick";
	    System.out.println(material_name1);
	    int bricks_quantity=30000;
	    int one_brick_price=10;
	    double total_bricks_cost= one_brick_price*bricks_quantity;
	    System.out.println("total_bricks_cost="+total_bricks_cost);
	    double discount_on_bricks=10; 
	    double final_bricks_cost=total_bricks_cost-(10/100.0)*total_bricks_cost;
	    System.out.println("final_bricks_cost="+final_bricks_cost);
	    String material_name2="fine aggregates";
	    System.out.println(material_name2);
	    double fine_aggregates_quanitity_ton=82;
	    double one_ton_cost=1000;
	    double total_fine_aggregates=82*1000;
	    System.out.println("total_fine_aggregates="+total_fine_aggregates);
	    String material_name3="cement";
	    System.out.println(material_name3);
	    int    cement_bag_quantity=400;
	    double one_cement_bag_cost=450;
	    System.out.println("one_cement_bag_cost="+one_cement_bag_cost);
	    double total_cement_cost=one_cement_bag_cost*cement_quantity;
	    System.out.println("total_cement_cost="+total_cement_cost);
	    double discount_on_cement=10;
	    double final_cement_cost=total_cement_cost-(10/100)*total_cement_cost;
	    System.out.println("final_cement_cost="+final_cement_cost);
	    String material_name4="coarse aggregates";
	    System.out.println(material_name4);
	    int  coarse_aggregates_quantity_in_tone=62;
            double one_tone_cost=850;
	    double total_coarse_aggregates=850*62;
	    System.out.println("total_coarse_aggregates="+total_coarse_aggregates);
	    String material_name5="steel";
	    System.out.println(material_name5);
	    int steel_quantity_in_kg=400;
	    int steel_kg_cost=60;
	    double total_steel_cost=steel_quantity_in_kg*steel_kg_cost;
	    System.out.println("total_steel_cost="+total_steel_cost);
	    double dis_for_steel=8;
	    total_steel_cost=total_steel_cost-dis_for_steel;
	    double total_bill=(final_bricks_cost)+(total_fine_aggregates)+(final_cement_cost)+(total_coarse_aggregates)+(total_steel_cost);
	    System.out.println("total_bill="+total_bill);
	     
	  	}
}
