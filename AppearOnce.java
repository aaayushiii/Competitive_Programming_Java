import java.util.*;
import java.lang.*;
import java.io.*;
class AppearOnce {
public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
   
while(t>0){
    int n=sc.nextInt();
    int arr[]=new int[n];
   for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
   }
       for(int i=0;i<n;i++){
           
           if(i%2==0){
                if((i)==(n-1)){
                    if(arr[n-1]!=arr[n-2])
                    System.out.println(arr[n-1]);
                    break;
                }
                                      
                   if(arr[i]==arr[i+1]){
                       continue;
                   }
                   else{

                       System.out.println(arr[i]);
                       break;
                   }
                 
               }
               
       }
               
   t--;
}
}
}