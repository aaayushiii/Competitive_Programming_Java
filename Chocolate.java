import java.util.*;
import java.io.*;
class Chocolate
{
	public static void main(String args[]) throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter no of test cases:\n");
	int t=Integer.parseInt(br.readLine().trim());
	while(t>0)
	{
		System.out.println("Enter no of packets of chocolate:\n");
		int n=Integer.parseInt(br.readLine().trim());
		int arr[]=new int[n];
		System.out.println("Enter no of chocolates in each packet 'space seperated':");
		String line[]=br.readLine().trim().split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(line[i]);
		}
		System.out.println("Enter no of students amoung whome chocolate is to be distributed:");
		int m=Integer.parseInt(br.readLine().trim());
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println("Elements are:"+arr[i]);
		}
		int diff=Integer.MAX_VALUE;
		int j=m-1;
		for(int i=0;i<n;i++)
		{
			int diffn=arr[j]-arr[i];
			if(diffn<diff)
			diff=diffn;
			j=i+1+(m-1);
			if(j>=n)
			{
				break;
			}			
		}
		System.out.println(diff);
		t--;
	}
	}	
}