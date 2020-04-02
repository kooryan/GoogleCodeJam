import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int T = in.nextInt();

        for (int i = 1; i<= T; i++) {
            int N = in.nextInt(); // holder variable that just withholds the dimensions of the maze but don't do anything with it
            String P = in.next();

            StringBuilder path = new StringBuilder();
            for (int j = 0; j < P.length(); j++){
                path.append(P.charAt(j) == 'E' ? 'S' : 'E');
            }

            System.out.println("Case #" + i + ": " + path);
        }
    }
}
