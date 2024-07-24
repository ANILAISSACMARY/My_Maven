package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ob=new ArrayList();
		ob.add(12);
		ob.add("anila");
		ob.add("12.3f");
		ob.add("12.555d");
		System.out.println(ob);
		ArrayList<String> obj=new ArrayList();
		obj.add("ANILA");
		obj.add("SNEHA");
		obj.add("NISHLEY");
		obj.add("NIXY");
		System.out.println(obj);
		
		obj.remove(0);
		System.out.println(obj);
		
		ArrayList<String> objt=new ArrayList();
		objt.add("AZA");
		objt.add("EVAN");
		objt.addAll(obj);
		System.out.println(objt);
		objt.removeAll(objt);
		System.out.println(objt);
		
		System.out.println(obj.get(0));
		System.out.println(obj.get(1));
		System.out.println(obj.get(2));
		System.out.println(obj.size());
		
		boolean a=obj.contains("SNEHA");
		System.out.println(a);
		boolean b =ob.contains("Anila");
		System.out.println(b);
		boolean c=objt.contains("EVAN");
		
		Iterator itr=ob.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		itr.remove();
	
		System.out.println(ob);

	}

}