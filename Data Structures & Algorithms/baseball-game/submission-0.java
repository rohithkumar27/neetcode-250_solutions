class Solution {
    public int calPoints(String[] operations) {
        //possible storage options are a list and stack or somethinglithat
        //travsting th  eoeprations
        //have a resurlt list
        // need to add a elemtn 
        // need to cout last 2 elements and add a new one
        // need to double last elemtn and add it 
        // need to remove last element

        //operations of stack in java

        Deque<Integer> stack = new ArrayDeque<>();
        Integer sum=0;
        
        for(String op:operations){
            if(op.equals("+")){
                int tempA=stack.peek();
                stack.pop();
                int tempB=stack.peek();
                stack.push(tempA);
                stack.push(tempA+tempB); 
                sum=sum+stack.peek();           

            }

            else if(op.equals("D")){
                int tempA=stack.peek();
                stack.push(2*tempA);
                sum+=stack.peek();




            }
            else if(op.equals("C")){

                if(stack.size()!=0){
                    sum=sum-stack.peek();

                stack.pop();
                }
                



            }

            else{
                stack.push(Integer.valueOf(op));
                sum=sum+stack.peek();
            }
        }
        
    return sum;
}

}