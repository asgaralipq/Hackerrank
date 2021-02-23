import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
        int numberOfValleys=0;
        int seaLevelCheck=0;
        int flag=0;
        
        for(int i=0; i<steps; i++){
            char step=path.charAt(i);
            if(step == 'U'){
                seaLevelCheck++;
            }
            else if(step == 'D'){
                seaLevelCheck--;
            }
            
            if(flag==1){
                if(seaLevelCheck>=0){
                    flag=0;
                }
            }
            
            if(seaLevelCheck<0 && flag==0){
                numberOfValleys++;
                flag=1;
            }
        }
        return numberOfValleys;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
