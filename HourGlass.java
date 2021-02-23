import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int row1, col1, row2, col2;
        int len=arr.length;
        int sum=0;
        int k=0;
        int max=0;
        int[] arr1 = new int[16];
        
        for(row2=0; row2<len-2; row2++){
            for(col2=0; col2<len-2; col2++){
                for(row1=row2; row1<row2+3; row1++){
                    for(col1=col2; col1<col2+3; col1++){
                        
                        if((row1==row2 || row1==row2+2) && (col1==col2 || col1==col2+2)){
                            System.out.println("1 "+col1+" "+row1+" "+col2+" "+row2);
                            sum=sum+arr[row1][col1];
                            System.out.println(arr[row1][col1]);
                            System.out.println(sum+" at "+col1+" "+row1);
                        }
                        if((row1==row2 || row1==row2+1 || row1==row2+2)  && col1==col2+1){
                            System.out.println("2 "+col1+" "+row1+" "+col2+" "+row2);
                            sum=sum+arr[row1][col1];
                            System.out.println(arr[row1][col1]);
                            System.out.println(sum+" at "+col1+" "+row1);
                        }
                    }
                }
            arr1[k]=sum;
            System.out.println("Hourglass "+k+" "+sum);
            k++;
            sum=0;
            }
        }
        
        max= arr1[0];
        for(int i=0; i<arr1.length-1; i++){
            if(max < arr1[i+1]){
                System.out.println("Comparing "+max+" "+arr1[i+1]);
                max = arr1[i+1];
            }
        }
        
        return max;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
