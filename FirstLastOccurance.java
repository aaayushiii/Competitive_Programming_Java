import java.util.*;
import java.lang.*;
import java.io.*;

class FirstLastOccurance {
public static void main (String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine().trim());
while(t>0){
    int val=0,val1=0,flag=0;
    int n=Integer.parseInt(br.readLine().trim());
    int arr[]=new int[n];
    String input[]=br.readLine().trim().split(" ");
    for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(input[i]);
    }
    int x=Integer.parseInt(br.readLine().trim());
    for(int i=0;i<n;i++){
        if(arr[i]==x){
            val=i;
            flag=1;
            break;
        }
        }
   
    for(int i=val;i<n;i++){
        if(arr[i]==x){
            val1=i;
        }
       
    }
    if(flag==0){
    System.out.println("-1");
        }
    else{
    System.out.println(val+" "+val1);
   
    }
   
    t--;
}
}
}
