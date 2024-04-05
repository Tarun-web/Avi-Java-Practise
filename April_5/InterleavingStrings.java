public class InterleavingStrings {
    public static int isInterleave(String A, String B, String C) {
        int m = A.length();
        int n = B.length();

        // If lengths of A and B don't add up to the length of C, return false
        if (m + n != C.length())
            return 0;

        // dp[i][j] will be true if C[0..i+j-1] is an interleaving of A[0..i-1] and
        // B[0..j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // Empty strings A and B can always interleave to form an empty string C
                if (i == 0 && j == 0)
                    dp[i][j] = true;
                // If A is empty, check if B matches C
                else if (i == 0)
                    dp[i][j] = (dp[i][j - 1] && B.charAt(j - 1) == C.charAt(i + j - 1));
                // If B is empty, check if A matches C
                else if (j == 0)
                    dp[i][j] = (dp[i - 1][j] && A.charAt(i - 1) == C.charAt(i + j - 1));
                // If both A and B are non-empty, check both possibilities
                else
                    dp[i][j] = (dp[i - 1][j] && A.charAt(i - 1) == C.charAt(i + j - 1)) ||
                            (dp[i][j - 1] && B.charAt(j - 1) == C.charAt(i + j - 1));
            }
        }

        // Return 1 if C is formed by interleaving of A and B, 0 otherwise
        return dp[m][n] ? 1 : 0;
    }

    public static void main(String[] args) {
        String A1 = "aabcc";
        String B1 = "dbbca";
        String C1 = "aadbbcbcac";

        String A2 = "aabcc";
        String B2 = "dbbca";
        String C2 = "aadbbbaccc";

        System.out.println(isInterleave(A1, B1, C1)); // Output: 1
        System.out.println(isInterleave(A2, B2, C2)); // Output: 0
    }
}
