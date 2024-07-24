package interface1;

public class Sample2 implements Sample{
	
	
	public void display()
	{
		System.out.println("interface ");
	}
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void print()
	{
		System.out.println("Method in Class");
	}

	public static void main(String[] args) {
		
		//Sample2 obj1=new Sample2();
		//obj1.display();
		//obj1.add();
		//obj1.print();
		Sample obj=new Sample2();
		obj.add();
	  obj.display();
	   
	   
		// TODO Auto-generated method stub

	}

}
