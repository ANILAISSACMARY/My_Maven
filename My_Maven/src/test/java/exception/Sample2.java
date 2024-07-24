package exception;

public class Sample2 {
	
	
	public void test(int age) throws LicenseException 
	{
		if(age<18)
	{ 
		throw new LicenseException("Not Eligibile");
	}
	else
	{
		System.out.println("ELIGIBILE");
	}
}

	

	public static void main(String[] args)  {
		
		Sample2 obj=new Sample2();
		try {
			obj.test(8);
		} catch (LicenseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		
		// TODO Auto-generated method stub

	}

}
