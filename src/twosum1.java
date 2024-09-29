class twosum1{
public int[] twosum(int[] nums, int target){
        for(int i=0;i<nums.length-1;i++) { //i stops at second last element
            for (int j = i + 1; j < nums.length; j++) { //j goes till last element, all possible pairs are compared
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {};
      }
}
