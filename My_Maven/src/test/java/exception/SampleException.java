package exception;

public class SampleException {
	
	
	public void display()
	{
		int a=70;
		try {
		int b=a/0;
		
		System.out.println(b);
		}
		catch(Exception e)
		
		{
			System.out.println("EXCEPTION Handled");
			System.out.println(e);
		}
		finally
		{
			System.out.println("final block");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SampleException obj=new SampleException();
	System.out.println("End Of Statement");
	
    obj.display();
	System.out.println("End Of Statement");
	
	
	}

}
