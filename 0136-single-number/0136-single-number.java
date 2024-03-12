class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 0) {
                index = i;
                System.out.println(nums[i] + " is only one time");
            }
        }

        return nums[index];
    }
}
