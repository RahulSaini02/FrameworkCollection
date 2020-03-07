package framework.collections;
import java.util.Collection;
import java.io.*;
import java.util.*;
public class treemap 
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1, "Hello");
		tm.put(2, "this");
		tm.put(3, "is");
		tm.put(4, "tree");
		tm.put(5, "map");
		System.out.println(tm);
	}
}
