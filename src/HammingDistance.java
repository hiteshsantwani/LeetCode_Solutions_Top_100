/*Hamming Distance*/ //- Top 100 on leet code
import java.util.Scanner;
class Solution {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int op = hammingDistance(x, y);
        System.out.println(op);
    }

    public static int hammingDistance(int x, int y) {
        int z = x ^ y;
        int op = Long.bitCount(z);
        return op;
    }
}

public class HammingDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            line = in.readLine();
            int y = Integer.parseInt(line);

            int ret = new Solution().hammingDistance(x, y);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}