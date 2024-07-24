package polymorphism;

public class ChildPoly extends ParentPoly {
	
	
	public void display()
	{
		System.out.println("child class");
		super.display();
	}

	public static void main(String[] args) {
		
		ChildPoly obj=new ChildPoly();
		obj.display();
		ParentPoly obj1=new ParentPoly();
		obj1.display();
		
		// TODO Auto-generated method stub

	}

}
