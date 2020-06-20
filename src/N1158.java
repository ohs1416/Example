import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder br = new StringBuilder();
        br.append("<");

        for (int i = 0; i < num; i++) {
            queue.add(i+1);
        }

        while(!queue.isEmpty()) {
            for (int i = 1; i <= k; i++) {
                if(i != k) {
                    queue.offer(queue.poll());
                }
                else {
                    br.append(queue.poll()).append(", ");
                }
            }
        }
        String sb = br.substring(0 , br.length()-2);
        br = new StringBuilder(sb);
        br.append(">");
        System.out.println(br);
    }
}
