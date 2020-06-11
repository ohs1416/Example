import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class N9012 {
    public static String isValid(String s) {
        String str = s.trim();
        int n = str.length();
        boolean isVal = true;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<n; i++) {
            char st = str.charAt(i);
            if (st == '(') {
                stack.push(st);
            } else {
                if(stack.isEmpty()) {
                    isVal = false;
                    break;
                }
                stack.pop();
            }
        }
        if (isVal  && stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            System.out.println(isValid(sc.nextLine()));
        }
    }
}