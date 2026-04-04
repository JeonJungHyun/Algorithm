import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;

        for(int i=0; i < 9; i++) {
            int N = Integer.parseInt(br.readLine());

            if(N > max) {
                max = N;
                index = i +1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}