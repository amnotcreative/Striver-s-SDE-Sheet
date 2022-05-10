import java.util.* ;
import java.io.*; 
import javafx.util.Pair;
public class Solution {

	public static Pair<Integer, Integer> missingAndRepeating(ArrayList<Integer> arr, int n) {
		// Write your code here
		int a[] = new int[n];
		int i=0, repeat=0;
		while(i<n)
		{
			if(a[arr.get(i)-1]==0)
				a[arr.get(i)-1]= -1;
			else
				repeat = arr.get(i);
			i++;
		}
		i=0;
		while(a[i]!=0)
		{
			i++;
		}
		Pair <Integer, Integer> p = new Pair<>(i+1, repeat);
		return p;
	}
}