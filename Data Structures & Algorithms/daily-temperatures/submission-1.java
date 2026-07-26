class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //monotonic stack
   //why ?shoudl i sue this is it that obvious

   Deque<Integer> stack = new ArrayDeque<Integer>();
   int[] result= new int[temperatures.length];
   

   for(int i=temperatures.length-1;i>=0;i--){
    int cur= temperatures[i];
        while(!stack.isEmpty() && cur >= temperatures[stack.peek()]){
            stack.pop();


        }

        if(!stack.isEmpty()){
            result[i]=stack.peek()-i;
        }
        stack.push(i);

            
   }

   return result;
        
    }
}
