import java.util.Scanner;
import java.util.Stack;

public class N10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int count = 0;
        sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            String line = sc.nextLine();
            String[] s = line.split(" ");
            String cmd = s[0];

            if (cmd.equals("push")) {
                int num = Integer.parseInt(s[1]);
                stack.push(num);
                count++;
            }
            if (cmd.equals("top")) {
                if(stack.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
            if(cmd.equals("pop")) {
                if(stack.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }
            if (cmd.equals("size")) {
                System.out.println(stack.size());
            }
            if (cmd.equals("empty")) {
                if(stack.empty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
