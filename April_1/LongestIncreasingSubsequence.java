package April_1;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static int longestIncreasingSubsequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        // Initialize all lengths to 1
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find the maximum length
        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 4, 11, 1, 16, 8};
        System.out.println(longestIncreasingSubsequence(nums1));  // Output: 3

        int[] nums2 = {1, 2, 2};
        System.out.println(longestIncreasingSubsequence(nums2));  // Output: 2
    }
}

