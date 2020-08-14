import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Stream;

class KthElementofTwoArrays {
   
    public static <T> Object[] concatenate(T[] arr, T[] arr1)
    {
       
        return Stream.concat(Arrays.stream(arr),  
                             Arrays.stream(arr1)).toArray();
    }
   
public static void main (String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
       
       while(t>0){
           String input1[]=br.readLine().trim().split(" ");
           int n=Integer.parseInt(input1[0]);
           int m=Integer.parseInt(input1[1]);
           int k=Integer.parseInt(input1[2]);
           
           Integer arr[]=new Integer[n];
           String input[]=br.readLine().trim().split(" ");
           for(int i=0;i<n;i++){
       arr[i]=Integer.parseInt(input[i]);
            }
           Integer arr1[]=new Integer[m];
           String input2[]=br.readLine().trim().split(" ");
           for(int i=0;i<m;i++){
       arr1[i]=Integer.parseInt(input2[i]);
            }
           
           Object[] c = concatenate(arr,arr1);
           Arrays.sort(c);
           System.out.println(c[k-1]);
 
     

           
          t--;
       }
}



}