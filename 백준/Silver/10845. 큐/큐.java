import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int lastNum = -1;

        for(int i=0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if(op.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                queue.add(num);
                lastNum = num;
            } else if(op.equals("pop")) {
                    if(queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.poll());
                    }
            } else if(op.equals("size")) {
                    System.out.println(queue.size());
            } else if(op.equals("empty")) {
                    if(queue.isEmpty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
            } else if(op.equals("front")) {
                    if(queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.peek());
                }
            } else if(op.equals("back")) {
                    if(queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(lastNum);
                }
            }
        }
    }
}