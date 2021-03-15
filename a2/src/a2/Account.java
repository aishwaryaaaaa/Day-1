package a2;

import java.util.Arrays;
import java.util.List;

public class Account {
	public static void main(String args[]) {
		String[] name= {"a","b","c"};
		Integer[] bal= {1,2,3};
		List<String> list=Arrays.asList(name);
		List<Integer> list1=Arrays.asList(bal);
		System.out.println(list+" "+list1);
		
	}

}
