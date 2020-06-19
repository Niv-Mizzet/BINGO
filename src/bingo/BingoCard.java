package bingo;

import java.util.ArrayList;
import java.util.Collections;

public class BingoCard {
	private static Integer[] ArrayCopy = new Integer[75];
	private static int i = 0;
		static {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();

		for(int i = 1 ; i <= 75 ; i++) {
		    arraylist.add(i);
		}

		Collections.shuffle(arraylist);
		Integer[] array = arraylist.toArray(new Integer[arraylist.size()]);
		System.arraycopy(array, 0, ArrayCopy, 0, 75);

		i = 0;
		for(Integer x :ArrayCopy) {
		System.out.println(i + " : " + x + ",");
		i++;
		}
	}

	public Integer[] getAC(){
		return ArrayCopy;
	}
}
