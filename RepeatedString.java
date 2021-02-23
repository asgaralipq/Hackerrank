import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long repeated=0;
        int j=0;
        char charc;
        long rep=0;
        long len = s.length();
        
        
            for(int i=0;i<len;i++){
                if(s.charAt(i) == 'a'){
                    repeated++;
                    System.out.println("Repeated");
                }
            }
            
            rep = n / len;
            repeated = repeated * rep;
            
            for(int i = 0; i < n%len; i++){
                if(s.charAt(i) == 'a'){
                    repeated++;
                }
            }
            
        return repeated;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
