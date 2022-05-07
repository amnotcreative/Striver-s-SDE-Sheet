import java.util.ArrayList;
//solution for code studio in java
public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
		 int i, l=prices.size(), prof=0, min=prices.get(0);
        for(i=1; i<l; i++)
        {
                min = prices.get(i)<min ? prices.get(i): min; 
                prof = prices.get(i)-min>prof ? (prices.get(i)-min):prof;
        }
        return prof;
    }
}