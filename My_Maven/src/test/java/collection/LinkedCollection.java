package collection;

import java.util.LinkedList;

public class LinkedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ob=new LinkedList();//non generic
		ob.add("Anila");
		ob.add(45);
		ob.add(45.7f);
		System.out.println(ob);
		
		
		LinkedList<String> obj=new LinkedList();
		obj.add("DEVAN");
		obj.add("ANITA");
		obj.add("SNEHA");
		obj.add("GOD");
		System.out.println(obj);
		
	    obj.remove(2);
	    System.out.println(obj);
				
	    
	    LinkedList<String> objt=new LinkedList();
	    objt.add("MARY");
	    objt.add("ROSAMMA");
	    objt.addAll(obj);
	    System.out.println(objt);
	    objt.removeAll(objt);
	    System.out.println(objt);
	    System.out.println(obj.get(0));
	    System.out.println(obj.size());
	     
	    boolean a=ob.contains("45");
	    System.out.println(a);
	    boolean b=obj.contains("SNEHA");
	    System.out.println(b);

	}

}
