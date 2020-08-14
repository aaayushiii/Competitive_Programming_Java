/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG 
    {
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t>0)
		{
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[]=new int[n];
		    String inputLine[]=br.readLine().trim().split(" ");
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=arr[i]*arr[i];
		    }
		    Arrays.sort(arr);
		    int flag=0;
		    for (int i = n - 1; i >= 2; i--) 
		    {
		        int l = 0;  
                int r = i - 1;
                while (l < r) 
                { 
                    if (arr[l] + arr[r] == arr[i])
                    {
                    flag=1;
                    break;
                    }
                    if (arr[l] + arr[r] < arr[i]) 
                        l++; 
                    else
                        r--; 
                } 
		    }
		    if(flag==1)
		    {
		        System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		    t--;
		}
	}
} 