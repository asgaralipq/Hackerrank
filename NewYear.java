import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int len=q.length;
        int temp;
        int flag=0;
        int sum=0;
        int[] numberOfBribes=new int[len];
        
     //   for(int i=0;i<len;i++){
     //       numberOfBribes[i]=0;
          //  System.out.println(i+" "+numberOfBribes[i]);
    //    }
        
        for(int i=0;i<len;i++){
            temp = q[i];
            for(int j=i+1; j<len; j++){
             //   System.out.println(temp+" temp j"+q[j]);
                if(temp > q[j]){
                    numberOfBribes[i]=numberOfBribes[i]+1;
                    if(numberOfBribes[i]>2){
                        flag=1;
                        break;
                    }
                //    System.out.println(i+" Increment? "+numberOfBribes[i]);
                }
            }
        }
        
        for(int i=0; i<len; i++){
       //     System.out.println(i+" "+numberOfBribes[i]);
            sum=sum+numberOfBribes[i];
        }
       // System.out.println(max+"max");
        if(flag==1){
        //    System.out.println(max);
            System.out.println("Too chaotic");
        }else{
            System.out.println(sum);
        }
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
