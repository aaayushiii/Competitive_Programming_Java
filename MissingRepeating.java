import java.util.*;
import java.lang.*;
import java.io.*;

class MissingRepeating {
public static void main (String[] args)throws Exception {
   
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t>0)
{
   int n=Integer.parseInt(br.readLine());
   String line[]=br.readLine().trim().split(" ");
            int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
       arr[i]=Integer.parseInt(line[i]);
   }
   
   int i=0;
      for (i = 0; i < n; i++)
      {
                int abs_val = Math.abs(arr[i]);
                if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
                else
                {
                System.out.print(abs_val+" ");
                }
                }
               
            for (i = 0; i < n; i++) {
                if (arr[i] > 0)
                    System.out.print(i + 1);
            }
   System.out.println();
   t--;
}
}
}