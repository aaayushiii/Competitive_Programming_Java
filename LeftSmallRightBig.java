/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t>0)
		{
		    int n = Integer.parseInt(br.readLine().trim());
		    String line[]=br.readLine().trim().split(" ");
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=Integer.parseInt(line[i]);
		    }
		    for(int i=1;i<n-1;i++)
		    {
		        int flag=0;
		        for(int j=0;j<i;j++)
		        {
		            if(arr[i]<arr[j])
		            {
		                flag=1;
		            }
		        }
		        if(flag==0)
		        {
		        for(int k=i+1;k<n;k++)
		        {
		            if(arr[i]>arr[k])
		            {
		                flag=1;
		            }
		        }
		        }
		        if(flag==0)
		        {
		            System.out.println(arr[i]);
		            break;
		        }
		    }
		    t--;
		}
	}
}