package framework.collections;
import java.util.Collection;
import java.io.*;
import java.util.*;
public class list 
{
	public static void main(String[] args)
	{
		List<Integer> a = new ArrayList<>();
		Queue<String> b = new LinkedList<>();
		
		a.add(0,5);
		a.add(1,10);
		a.add(2,15);
		
		System.out.println(a);
		
		b.add("2.5");
		b.add("3.5");
		b.add("4.5");
		b.add("2.5");
		b.remove("2.5");
		System.out.println(b);
		
		
	}
}
