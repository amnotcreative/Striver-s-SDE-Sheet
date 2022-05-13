import java.util.* ;
import java.io.*; 
public class Solution {
	static long c =0;
    public static long getInversions(long arr[], int n) {
        // Solution using merge sort
		mergeSort(arr,0, n-1);
		return c;
    }
	
	private static void mergeSort(long arr[], int low, int high)
	{
		
		if(low<high)
		{
			int mid = (high+low)/2;
			mergeSort(arr,low, mid);
			mergeSort(arr,mid+1, high);
			merge(arr, low, mid, high);
		}
	}
	
		private static void merge(long arr[], int low, int mid, int high)
		{
			int n1= mid-low+1;
			int n2= high-mid;
			
			long l[]= new long[n1];
			long r[] = new long[n2];
			
			for(int i=0; i<n1; i++)
			{
				l[i]=arr[low+i];
			}
			
			for(int j=0; j<n2; j++)
			{
				r[j]=arr[mid+j+1];
			}
			int i=0,j=0, k=low;
			while(i<n1 && j<n2)
			{
				if(l[i]<=r[j])
				{
					arr[k]=l[i];
					i++;
				}
				else{
					arr[k]=r[j];
					j++;
					c+= (n1-i);
				}
				k++;
			}
			
			while(i<n1)
			{
				arr[k]=l[i];
				i++;
				k++;
			}
			
			while(j<n2)
			{
				arr[k]=r[j];
				j++;
				k++;
			}
		}
}