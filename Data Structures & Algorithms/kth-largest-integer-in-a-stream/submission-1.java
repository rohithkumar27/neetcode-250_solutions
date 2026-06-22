class KthLargest {
    private int k;
    private int[] nums;
    private PriorityQueue<Integer> pq;


    public KthLargest(int k, int[] nums) {
       this.k=k;
       this.nums=nums;
       this.pq =new PriorityQueue<Integer>();
    for(int num:nums){
        this.add(num);
    }

             
    }
    
    public int add(int val) {
        if(pq.size()<k){
            pq.add(val);      
        }
        else if(pq.peek()<val){
            pq.poll();
            pq.add(val);

        }
        if(pq.size()<k){
            return 0;
        }

        return pq.peek();
           
    }
}
