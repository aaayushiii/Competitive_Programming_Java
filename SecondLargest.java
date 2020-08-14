import java.util.*;
import java.lang.*;
import java.io.*;

class SecondLargest {
public static void main (String[] args) {
  int T;
  Scanner sc=new Scanner(System.in);
  T=sc.nextInt();
  while(T>0){
      int N,i;
      N=sc.nextInt();
      int arr[]=new int[N];
      for(i=0;i<N;i++){
          arr[i]=sc.nextInt();
         
          }
          Arrays.sort(arr);
          Arrays.toString(arr);
          System.out.print(arr[N-2]);
          System.out.println();
          T--;
     
      }

     
  }
}