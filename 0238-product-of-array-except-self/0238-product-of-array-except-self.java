class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] prePro = new int[n];
        prePro[0] = 1;
        for (int i = 1; i < n; i++) {
         prePro[i] = prePro[i - 1] * nums[i - 1];
}
          int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
               prePro[i] *= suffix;
               suffix *= nums[i];
}
                 
            return prePro;

        
        
    }
}