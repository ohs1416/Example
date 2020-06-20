import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int[] cnt = new int[26];
        for (int i = 0; i < word.length(); i++) {
            cnt[word.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < cnt.length; i++) {
            System.out.print(cnt[i] + " ");
        }
    }
}
