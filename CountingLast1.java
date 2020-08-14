/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class CountingLast1 {
	public static void main (String[] args)throws Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while(t>0)
		{
		String l=br.readLine();
		int el=0;
		int flag=0;
		int size=l.length()-1;
System.out.println("size is:"+size);
		for(int i=size;i>=0;i--)
		{
			System.out.println("character is:"+l.charAt(i));
		    if(Character.compare(l.charAt(i),'1')==0);
		    {
		     flag=1;
		     el=i;
		     System.out.println("Hey I ran"+el);
		     break;
		    }
		}
		if(flag==1)
		{
		    System.out.println(el);
		}
		else
		{
		    System.out.println(-1);
		}
		t--;
		}
	}
}