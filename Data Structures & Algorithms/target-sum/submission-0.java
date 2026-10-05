class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

      if(sum<target||(sum-target)%2!=0){
            return 0;
      }

      int subSetSum=(sum-target)/2;
      

      int[]  dp = new int[subSetSum+1];
      
      dp[0]=1;



      for(int i=0;i<nums.length;i++){
        for(int j=subSetSum;j>=nums[i];j--){
            dp[j]+= dp[j-nums[i]];
        }
      }


    return dp[subSetSum];

    // tc.  O(n* target)
    //space O(subsetSum-> O())
 

    }
}
