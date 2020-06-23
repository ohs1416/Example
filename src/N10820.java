import java.util.Scanner;

public class N10820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            int count1 = 0, count2 = 0 , count3 = 0 , count4 = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(Character.isLowerCase(c)) {
                    count1++;
                }
                else if (Character.isUpperCase(c)) {
                    count2++;
                }
                else if (Character.isDigit(c)) {
                    count3++;
                }
                else if (Character.isWhitespace(c)) {
                    count4++;
                }
            }
            sb.append(count1).append(' ').append(count2).append(' ').append(count3).append(' ').append(count4);
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
