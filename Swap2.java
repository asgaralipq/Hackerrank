import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int swaps=0;
        int flag=0;
        
        
        for(int i = 0 ; i < arr.length ; i++){
            
            if(flag==1){
                i=0;
            }
            if(arr[i]!=(i+1)){
                
                int index=arr[i]-1;
                int temp1=arr[i];
                arr[i]=arr[index];
                arr[index]=temp1;
                flag=1;
                
                swaps++;
                
            }else{
                flag=0;
            }
        }
        
        
        return swaps;
    }
    
     static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }

    static int indexOf(int[] arr1, int ele) {
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==ele){
                return i;
            }
        }
        return -1;
     }
     
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
