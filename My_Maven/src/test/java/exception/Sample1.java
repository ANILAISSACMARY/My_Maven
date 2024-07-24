package exception;

public class Sample1 {
	
	
	
	public void print(int age) throws VotingException
	{
		if(age<18)
		{
			throw new VotingException("not eligibile");
		}
		
		else {
			System.out.println("eligibile");
		}
	}

	public static void main(String[] args)  {
		
		Sample1 obj=new Sample1();
		try {
			obj.print(4);
		} catch (VotingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
		// TODO Auto-generated method stub
		
	}
