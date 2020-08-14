import java.util.*;
import java.lang.*;
import java.io.*;

class ZigZag {
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0){
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
   }
   int temp=0;
   for(int i=0;i<n;i++){
       for(int j=0;j<n-1;j++){
           if(j%2==0){
           if (arr[j]<arr[j+1]){
          continue;
           }
           else{
           temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  
           }
           }
           else{
               if(arr[j]>arr[j+1]){
                   continue;
               }
               else{
           temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  
           }
           }
           }
               }
 for(int i=0;i<n;i++){
  System.out.print(arr[i]+" ");
  }
  System.out.println();
       t--;
   }
}
}