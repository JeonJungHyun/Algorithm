import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String[] input = br.readLine().split( " " );
        int A = Integer.parseInt( input[0] );
        int B = Integer.parseInt( input[1] );
            
            if( A > B ) {
                System.out.println( ">" );
            } else if( A < B ) {
                System.out.println( "<" );
            } else {
                System.out.println( "==" );
            }
        }
    }
