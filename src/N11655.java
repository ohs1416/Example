import java.util.Scanner;

public class N11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb= new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'm') {
                c += 13;
            }
            else if ( c >= 'n' && c <= 'z') {
                c -= 13;
            }
            else if (c >= 'A' && c <= 'M') {
                c += 13;
            }
            else if (c >= 'N' && c <= 'Z') {
                c -= 13;
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}
