import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if (op.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            } else if (op.equals("pop")) {
                    if(stack.isEmpty()) {
                        System.out.println("-1");
                    } else {    
                        System.out.println(stack.pop());
                    }
            } else if(op.equals("size")) {
                System.out.println(stack.size());
            } else if(op.equals("empty")) {
                if(stack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if(op.equals("top")) {
                    if(stack.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.peek());
                }
            }
        }
    }
}
