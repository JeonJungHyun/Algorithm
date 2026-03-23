import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
        String[] firstLine = br.readLine().split(" ");

        int N = Integer.parseInt(firstLine[0]);
        int X = Integer.parseInt(firstLine[1]);

        String[] A = br.readLine().split(" ");
        
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(A[i]);

            if(num < X) {
                System.out.print( num + " ");
            }
        }
    }
}