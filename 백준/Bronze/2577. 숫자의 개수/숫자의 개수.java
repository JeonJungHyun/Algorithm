import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;
        String strResult = String.valueOf(result);

        int[] counts = new int[10];

        for(int i=0; i<strResult.length(); i++) {
            int num = strResult.charAt(i) - '0';
            counts[num]++;         
        }
        for(int i=0; i<10; i++) {
            System.out.println(counts[i]);
        }
    }
}