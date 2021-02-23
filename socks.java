import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class socks {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int pairOfSocks = 0;
        int socks = 0;
        int flag=0;
        int[] sockDone = new int[n];
        for(int i=0;i<n;i++){
            flag=0;
            socks=0;
            int sock = ar[i];
             
            for(int j=0; j<sockDone.length; j++){   
                if(sock == sockDone[j]){
                    System.out.println("1. Checking "+sock+" against "+sockDone[j]);
                    System.out.println("This "+sock+" is already done");
                    flag=1;
                    break;
                }
            }
            
            sockDone[i] = sock;
            if(flag==1){
                continue;
            }
            
            for(int j=0; j<n; j++){  
                    if(sock == ar[j]){
                    System.out.println("2. Checking "+sock+" against "+ar[j]);
                    socks++;
                        if(socks == 2){
                            pairOfSocks++;
                            socks=0;
                        }
                    }
            }
                
        }
        return pairOfSocks;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
