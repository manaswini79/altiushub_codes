import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String matrix[][] = new String[n][m];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++) {
            	matrix[i][j] = sc.next();
            }
        }
        int max = 0;
        int[] len = new int[m];
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (matrix[i][j] == "1")len[j]++;
                else len[j] = 0;
            }
            max =Math.max(max,helper(len));
        }
        System.out.println(max);
    }
    public static int helper(int[] len) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int newl[] = new int[len.length];
        for(int i=0;i<len.length;i++) {
        	newl[i] = len[i];
        }

        for (int i = 0; i < newl.length; i++) {
            while (!stack.isEmpty() && newl[i] < newl[stack.peek()]) {
                int height = newl[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, height * width);
            }
            stack.push(i);
        }
        return max;
    }
}
