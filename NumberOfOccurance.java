import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
public static void main (String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine().trim());
while(t>0){
    int count=0;
    String input[]=br.readLine().trim().split(" ");
    int n=Integer.parseInt(input[0]);
    int x=Integer.parseInt(input[1]);
    int arr[]=new int[n];
    String input1[]=br.readLine().trim().split(" ");
    for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(input1[i]);
    }
    for(int i=0;i<n;i++){
        if(arr[i]==x){
         
          count=count+1;  
           
        }
       
}
if(count==0){
    System.out.println("-1");
}
else
{
    System.out.println(count);
}
t--;
}
}
}
