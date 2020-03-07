package framework.collections;
import java.util.Collection;
import java.util.Map;
import java.io.*;
import java.util.*;

public class hashset 
{
	public static void main(String[] args)
	{
		int a[] = new int[] {1,2,3,4,5,2,1};
		HashSet<Integer> hs = new HashSet<>();
		for (int x: a)
			hs.add(x);
		
		System.out.println("before adding:");
		System.out.println(hs);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		System.out.println("After adding:");
		System.out.println(hs);
		
	}
}