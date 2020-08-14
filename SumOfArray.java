import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
public static void main (String[] args) {
int T;
Scanner sc= new Scanner(System.in);
T=sc.nextInt();

while(T>0)
{
   int N,sum=0;
   N=sc.nextInt();
   int array[]=new int[N];
   for(int i=0;i<N;i++){
       array[i]=sc.nextInt();
   }
   for(int i=0;i<N;i++){
      sum=sum+array[i];
     
   }
   System.out.println(sum);
   
   T--;
}
}
}
