import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[8];
        for(int i=0; i<8; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        String result = "";

        if(a[0] == 1) {
            result = "ascending";
            for(int i=0; i<8; i++) {
                if(a[i] != i + 1) {
                    result = "mixed";
                    break;
                }
            }
        } else if (a[0] == 8) {
            result = "descending";
            for(int i=0; i<8; i++) {
                if(a[i] != 8 - i) {
                    result = "mixed";
                    break;
                }
            }
        } else {
            result = "mixed";
        }
       System.out.println(result);
    }
}
