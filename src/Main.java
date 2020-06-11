import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <  N; i++) {
            for(int j=1;j<2*N;j++) {
                if(j>N+i) break;
                if(i==N-1) {
                    sb.append('*');
                    continue;
                }
                if(j==N-i || j==N+i) {
                    sb.append('*');
                }else
                    sb.append(' ');
            }
            sb.append('\n');

        }

        System.out.println(sb);
    }
}
