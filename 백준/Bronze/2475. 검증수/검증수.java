import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
    String line = br.readLine();
    String[] input = line.split(" ");
    
    int sum = 0;

    for(int i=0; i <5; i++) {
        int a = Integer.parseInt(input[i]);
        sum = sum + (a*a);
    }
    System.out.println(sum % 10);
    }
}