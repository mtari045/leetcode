class Solution {
    public int[] twoSum(int[] nums, int target) {
        int solutions[] = {0, 0};
        for(int i = 0; i <= nums.length-1; i++){
            for(int j = 0; j<i; j++){
                if(nums[i] + nums[j] == target){
                  solutions[0] = i;
                  solutions[1] = j; 
                }
            }
        } 
        return solutions;
    }
}