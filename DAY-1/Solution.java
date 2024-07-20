class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroAt = 0;
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                int temp = nums[lastNonZeroAt];
                nums[lastNonZeroAt] = nums[current];
                nums[current] = temp;
                lastNonZeroAt++;
            }
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        sol.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}