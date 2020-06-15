import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class N9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        boolean isTru = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(') {
                    stack.push(c);
                } else if(c == ')') {
                    if(!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        isTru = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) { isTru = false;}

            if (isTru) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}