import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseArrayInGroups{
public static void reverseInGroup(int arr[], int n, int k) {
        for (int i = 0; i < n; i=i+k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            int temp;
            while (left < right) {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }
        }
    }
   
public static void main (String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
while(t-->0){
   String inputLine1[] = br.readLine().trim().split(" ");
   int n = Integer.parseInt(inputLine1[0]);
   int k = Integer.parseInt(inputLine1[1]);
   int arr[] = new int[n];
   String inputLine2[] = br.readLine().trim().split(" ");
   for(int i=0; i<n; i++){
       arr[i]=Integer.parseInt(inputLine2[i]);
   }
   reverseInGroup(arr, n, k);
   StringBuffer str = new StringBuffer();
   for(int i=0; i<n; i++){
       str.append(arr[i] + " ");
   }
   System.out.println(str);
}
}
}
