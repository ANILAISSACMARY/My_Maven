package collection;

import java.util.ArrayList;

import java.util.List;

public class ListCollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List ob=new ArrayList();
		ob.add("Anila");
		ob.add(12);
		ob.add(45.7f);
		System.out.println(ob);
		
	List<String> obj=new ArrayList();
	obj.add("AZA");
	obj.add("HELEN");
	obj.add("ZEFIA");
	obj.add("SHALU");
	System.out.println(obj);
		
	obj.remove(2);
	System.out.println(obj);
	
	List<String> objt=new ArrayList();
	objt.add("SIMY");
	objt.add("LIMY");
	System.out.println(objt);
	
	objt.addAll(obj);
	System.out.println(objt);
	objt.removeAll(objt);
	System.out.println(objt);
	System.out.println(ob.get(1));
	System.out.println(ob.size());
	boolean a=obj.contains("SAMA");
	System.out.println(a);
	boolean b=ob.contains(12);
	System.out.println(b);
	
	
	}

}


