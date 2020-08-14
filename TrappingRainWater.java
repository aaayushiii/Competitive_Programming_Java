/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;
class Trapp {
	public static void main (String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int times=obj.nextInt();
		while(times>0)
		{
		    int n = obj.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=obj.nextInt();
		    }
            int result = 0; 
            // maximum element on left and right 
            int left_max = 0, right_max = 0; 
            // indices to traverse the array 
            int lo = 0, hi = n - 1; 
            while (lo <= hi) 
            { 
                if (arr[lo] < arr[hi])
                    { 
                    if (arr[lo] > left_max) 
                    left_max = arr[lo]; 
                    else
                    result += left_max - arr[lo]; 
                    lo++; 
                    } 
                else 
                    { 
                    if (arr[hi] > right_max) 
                    // update right maximum 
                    right_max = arr[hi]; 
                    else
                    result += right_max - arr[hi]; 
                    hi--; 
                    } 
            } 
		    System.out.println(result);
		    times--;
		}
	}
}