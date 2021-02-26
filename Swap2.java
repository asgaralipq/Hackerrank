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
        int[] temp=Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(temp);
        int[] arrflag = new int[arr.length];
        
        for(int k=0;k<arr.length;k++){
            arrflag[k]=0;
        }
        
        
        for(int i = 0 ; i < arr.length ; i++){
            
            if(flag==1){
                i=0;
            }
            System.out.println("i 1 "+i);
            if(arr[i]!=(i+1)){
                
                int index=arr[i]-1;
                int temp1=arr[i];
                arr[i]=arr[index];
                arr[index]=temp1;
                flag=1;
                
                System.out.println("Swapping "+arr[i]+" and "+(arr[index]));
                swaps++;
                
            }else{
                flag=0;
            }
        }
        
        
     //   for(int i=0;i<arr.length;i++){
      //      System.out.println(arr[i]);
      //  }
        return swaps;
    }
    
     static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }

    static int indexOf(int[] arr1, int ele) {
        for(int i=0;i<arr1.length;i++){
            System.out.println("Finding.."+arr1[i]);
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
