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
		    int buy=-1;
		    int sell=-1;
		    int flag=0;
		    int pflag=0;
		    int nflag=0;
		    for(int i=0;i<n-1;i++)
		    {
		        if((arr[i]<arr[i+1]) && flag==0)
		        {
		            buy=i;
		            flag=1;
		        }
		        else if((arr[i]>arr[i+1]) && flag==1)
		        {
		            sell=i;
		            flag=0;
		            pflag=1;
		        }
		        if((i+1==n-1) && flag==1)
		        {
		            if(arr[i]<arr[i+1])
		            {
		            sell=i+1;
		            }
		            else
		            {
		                sell=i;
		            }
		            pflag=1;
		        }
		        if(pflag==1)
		        {
		            System.out.print("("+buy+" "+sell+")"+" ");
		            nflag=1;
		            pflag=0;
		        }
		    }
		    if(nflag==0)
		    {
		        System.out.print("No Profit");
		    }
		    System.out.println();
		    t--;
		}
	}
}