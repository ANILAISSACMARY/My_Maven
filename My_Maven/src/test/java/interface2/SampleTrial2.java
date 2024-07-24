package interface2;

public class SampleTrial2 implements SampleTrial{
	
	public void div()
	{
		System.out.println(a/b);
	}
	
	public void mul()
	{
		System.out.println(a*b);
	}
	
	public void area()
	{
		System.out.println(4*a);
	}
	
	public void print()
	{
		System.out.println("trial");
		
	}
	

	public static void main(String[] args) {
		
		/*SampleTrial2 obj=new SampleTrial2();
		obj.mul();
		obj.div();
		//obj.print();
		obj.area();*/
		SampleTrial obj1=new SampleTrial2();
		obj1.mul();
		obj1.div();
		obj1.area();
		//obj1.print();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
