import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * GEEKSFORGEEKS
 * G      S     G      S
 *  E   K  F  R  E   K
 *    E     O      E
 * OUTPUT: GSGSEKFREKEOE
 */
public class ZigZagString {

    public static String print(String s, int rows){
        int pos = 0;
        int counter=0;
        Map<Integer, StringBuilder> map = new HashMap<>();
        boolean flip = false;
        while(pos<s.length()){
            if(!flip){
                counter++;
                if(counter>=rows){
                    flip=true;
                }
            }else{
                counter--;
                if(counter<=1){
                    flip=false;
                }
            }

            char c = s.charAt(pos);
            StringBuilder string = map.get(counter);
            if(string!=null){
                string.append(c);
                map.put(counter, string);
            }else{
                map.put(counter, new StringBuilder().append(c));
            }
            pos++;
        }
        StringBuilder res = new StringBuilder();
        for(int i=1; i<=rows; i++){
            res.append(map.get(i));
        }
        return res.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int rows = Integer.parseInt(br.readLine());
        //String s = "ABCDEFGH";
        System.out.println(print(s, rows));
    }
}
