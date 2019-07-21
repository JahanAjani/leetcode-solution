import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
/*
 * Thoughtworks hiring challenge 22-July-2019 question's solution.
 * - Print the total count of substring containing odd number of 1 in the binary representation of given input,
 * also print separately total count of substring containing odd number of 0.
 */
public class BitMadness {
    public static void main(String[] args) throws IOException {
        //Fast input reader to reduce time to read.
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= t; ++i) {
            //convert input number to binary char array format.
            char[] n = new BigInteger(br.readLine()).toString(2).toCharArray();
            int odd0Count = countOddChar(n,'0'); //count odd 0 bits
            int odd1Count = countOddChar(n,'1'); //count odd 1 bits
            System.out.println(odd0Count+" "+odd1Count);
        }
    }

    private static int countOddChar(char[] s, char charToCount) {
        int odd1 = 0;
        int count1;
        byte is_odd;
        int i = 0;
        while(i<s.length){
            count1 =0;
            is_odd = 0;
            for(int j=i;j<s.length;j++){
                if(s[j]==charToCount){
                    count1++;
                    if((count1&1)==1){
                        is_odd=1;
                    }else{
                        is_odd =0;
                    }
                }
                if(is_odd==1){
                    odd1 +=1;
                }

            }
            i++;
        }
        return odd1;

    }
}