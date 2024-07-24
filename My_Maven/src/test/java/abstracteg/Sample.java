package abstracteg;

public class Sample extends AbstractClass{
	
	public void print()
	{
		System.out.println("Abstract Method");
	}

	public static void main(String[] args) {
		
		Sample obj=new Sample();
		obj.print();
		obj.display();
		//AbstractClass obj=new AbstractClass();
		
		// TODO Auto-generated method stub

	}

}
