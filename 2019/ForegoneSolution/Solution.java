import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int T = in.nextInt();

        for (int i = 1; i <= T; i++) {
            String N = in.next();

            StringBuilder A = new StringBuilder();
            StringBuilder B = new StringBuilder();

            int appendPosition = 0;
            boolean firstZero = true;

            for(int j = 0; j < N.length(); j++) {
                if (N.charAt(j) == '4') {
                    A.append('3');
                    B.append('1');
                    if (firstZero) {
                        appendPosition = j;
                        firstZero = false;
                    }
                } else {
                    A.append(N.charAt(j));
                    B.append('0');
                }
            }

            String B1 = B.substring(appendPosition, N.length());
            System.out.println("Case #" +  i + ": " + A + " " + B1);
        }
    }
}
