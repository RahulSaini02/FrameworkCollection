package framework.collections;
import java.util.Collection;
import java.util.Map;
import java.io.*;
import java.util.*;

public class hashmap 
{
	public static void main(String[] args)
	{
		int a[] = new int[] {1,2,3,4,5,2,1};
		HashMap<Integer,Integer> hm = new HashMap<>();
		for (int x: a)
		{
			if(hm.containsKey(x))
				hm.put(x, hm.get(x)+1);
			else
				hm.put(x, 1);
		}
		System.out.println(hm);
	}
}
