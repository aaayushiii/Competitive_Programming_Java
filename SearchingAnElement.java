import java.util.*;
import java.lang.*;
import java.io.*;

class SearchingAnElement{
public static void main (String[] args) {
int T;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
while(T>0){
int N,n;

N=sc.nextInt();

int arr[]=new int[N];
for(int i=0;i<N;i++){
    arr[i]=sc.nextInt();
}


n=sc.nextInt();

int ind=-1;
for(int i=0;i<N;i++){
   if(n==arr[i]){
       ind=i;
       break;
   }
   }
System.out.println(ind);


T--;
}
}
}
