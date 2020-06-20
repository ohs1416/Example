import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class N10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < p; i++) {
            String s = br.readLine();
            String[] cmd = s.split(" ");
            String what = cmd[0];

            if(what.equals("push")) {
                queue.offer(Integer.parseInt(cmd[1]));
            }
            else if(what.equals("front")) {
                if(queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peek());
                }
            }
            else if(what.equals("back")) {
                if(queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.poll());
                }
            }
            else if(what.equals("empty")) {
                if(queue.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            else if(what.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.remove());
                }
            }
        }
    }
}
