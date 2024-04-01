package April_1;

import java.util.Scanner;

public class MinimumPathSumTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of rows in triangle
            int[][] triangle = new int[N][];
            for (int i = 0; i < N; i++) {
                triangle[i] = new int[i + 1];
                for (int j = 0; j <= i; j++) {
                    triangle[i][j] = scanner.nextInt(); // Reading triangle elements
                }
            }
            System.out.println(minimumPathSum(triangle));
        }
        scanner.close();
    }

    private static int minimumPathSum(int[][] triangle) {
        int n = triangle.length;
        int[] dp = new int[n];

        // Initialize dp array with the last row of the triangle
        for (int i = 0; i < n; i++) {
            dp[i] = triangle[n - 1][i];
        }

        // Calculate minimum path sum for each element from bottom to top
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // Choose the minimum path sum from the two adjacent elements in the row below
                dp[j] = triangle[i][j] + Math.min(dp[j], dp[j + 1]);
            }
        }

        // The first element of dp array will contain the minimum path sum
        return dp[0];
    }
}

