class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0)
            return 0;

        int front = nums[0], back = nums[nums.length - 1];
        int maxProduct = Math.max(front, back);

        for (int i = 1; i < nums.length; i++) {
            if (front == 0)
                front = 1;
            if (back == 0)
                back = 1;

            front *= nums[i];
            back *= nums[nums.length - i - 1];

            maxProduct = Math.max(maxProduct, Math.max(front, back));
        }

        return maxProduct;
    }
}
