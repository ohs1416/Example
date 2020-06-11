import java.util.Scanner;
import java.util.Stack;

public class N10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cut = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                if ((stack.peek()+1) == i) {
                    stack.pop();
                    cut += stack.size();
                } else {
                    stack.pop();
                    cut += 1;
                }
            }
        }
        System.out.println(cut);
    }
}
