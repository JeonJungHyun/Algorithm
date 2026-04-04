import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1000000;
        int min = 1000000;
        
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String[] numbers = line.split(" ");

        for(int i=0; i<N; i++) {
            int current = Integer.parseInt(numbers[i]);
            
            if(current>max) {
                max = current;
            }
            if(current<min) {
                min = current;
            }
        }
        System.out.println(min + " " + max);
    }
}