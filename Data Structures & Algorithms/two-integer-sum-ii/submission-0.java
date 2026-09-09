class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //numbers 
        //[index1,index2]
        // 
        int[] ans=new int[2];

        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int currSum= numbers[start]+numbers[end];
            if(currSum==target){
                ans[0]=start+1;
                ans[1]=end+1;
                return ans;
            }
            else if(currSum<target){
                start++;

            }
            else{
                end--;
            }
        }

    return ans;
    }
}
