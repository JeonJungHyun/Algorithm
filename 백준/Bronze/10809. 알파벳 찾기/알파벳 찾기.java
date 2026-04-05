import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();

        int[] counts = new int[26];

        for(int i=0; i<26; i++) {
            counts[i] = -1;
        }
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            int index = ch - 'a';

            if(counts[index] == -1) {
                counts[index] = i;
            }
        }
        for(int i=0; i<26; i++) {
            System.out.print(counts[i] + " ");
        }
    }
}
