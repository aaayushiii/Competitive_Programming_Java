import java.util.*;
import java.lang.*;
import java.io.*;
class Primecheck {
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
static void isPrime(int n)
{
    int flag=0;
       if(n==1){
           System.out.println("No");
       }
       else{
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0){
                    flag=1;
                }
            }
            if(flag==1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
       }
}

}
