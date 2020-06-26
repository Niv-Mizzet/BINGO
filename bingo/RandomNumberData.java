package bingo;

import java.util.ArrayList;
import java.util.Collections;

public class RandomNumberData {
	private static ArrayList<Integer> RandomArray = new ArrayList<Integer>();
    private static int[] KisyutsuArray = new int[150];
    private static int K = 0;

	static {
		for(int i = 1 ; i <= 75 ; i++) {
			RandomArray.add(i);
		}
		Collections.shuffle(RandomArray);
	}

	public ArrayList<Integer> getRA(){
		return RandomArray;
	}
	public void setKA(int[] x) {
		KisyutsuArray = x;
		}
	public int[] getKA() {
		return KisyutsuArray;
	}
	public void setK(int i) {
		K = i;
	}
	public int getK() {
		return K;
	}
}
