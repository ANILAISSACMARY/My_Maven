package exception;

public class ThrowException {
	
	public static void test(int age)
	{
	
		if(age<18)
		{ 
			throw new ArithmeticException("Not Eligibile");
		}
		else
		{
			System.out.println("ELIGIBILE");
		}
	}

	public static void main(String[] args) {
		
		ThrowException.test(8);
		System.out.println("End");
		
		
		// TODO Auto-generated method stub

	}

}

//public void display() throws ExceptionClassname
//{
//}

