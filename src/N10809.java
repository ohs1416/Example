import java.util.Arrays;
import java.util.Scanner;

public class N10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int[] cmt = new int[26];
        StringBuilder sr = new StringBuilder();
        Arrays.fill(cmt, -1);

        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            if(cmt[c] == -1) {
                cmt[c] = i;
            }
        }

        for (int i = 0; i < cmt.length; i++) {
            sr.append(cmt[i]).append(" ");
        }
        System.out.println(sr);
    }
}
