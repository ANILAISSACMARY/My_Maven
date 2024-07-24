package exception;

public class SampleExeption2 {
	
	public void print()
	{
	
	String s=null;
	
	try {
		System.out.println(s.length());
	}
	
	
	
	catch(Exception e)
	{
		System.out.println("EXCEPTION handled");
		System.out.println(e);
	}
	}
	
	
	
	

	public static void main(String[] args) {
		
		
		SampleExeption2 obj=new SampleExeption2();
		obj.print();
		
		// TODO Auto-generated method stub

	}

}
