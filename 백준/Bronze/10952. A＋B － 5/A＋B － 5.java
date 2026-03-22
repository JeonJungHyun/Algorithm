import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
        while(true) {
            String inputLine = br.readLine();
            if(inputLine == null) {
                break;
            }
            String[] input = inputLine.split( " ");
            int A = Integer.parseInt( input[0]);
            int B = Integer.parseInt( input[1]);

            if(A == 0 && B == 0) {
                break;
            }
            System.out.println( A + B);
        }
    }
}
