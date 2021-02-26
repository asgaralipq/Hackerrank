public import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        System.out.println("N "+n);
        long[] arr = new long[n];
        int index1 = 0;
        int index2 = 0;
        long add=0;
        long max=0;
        
        for(int i=0; i<n; i++){
            arr[i]=0;
        }
        
        for(int i=0; i<queries.length; i++){
            for(int j=0; j<queries.length; j++){
                    if(j==0){
                        
                        index1=queries[i][j];
                    }
                    if(j==1){ 
                        index2=queries[i][j];
                    }
                    if(j==2){ 
                        add=queries[i][j];
                        for(int k=index1-1; k<index2; k++){
                            arr[k]=arr[k]+add;
                        }
                    }
            }
        }
        max=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
class ArrayManipulation {
    
}
