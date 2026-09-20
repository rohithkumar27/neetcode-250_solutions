class Solution {
    public int maxArea(int[] heights) {
        //height is h= min(h(x),h(y)
        //vol=(x-y) *(h)
        int ans=0;
        int start=0;
        int end=heights.length-1;
        while(start<end){
            int vol=(Math.min(heights[start],heights[end]))*(end-start);
            ans=Math.max(ans,vol);

            if(heights[start]<=heights[end]){
                start++;

            }

            else{

            end--;

            }
        }

        return ans;
        
    }
}
