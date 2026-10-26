class KthLargest {
    private int k;
    private PriorityQueue<Integer>pq = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.k=k;
        int n=nums.length;
        for(int i=0;i<n;i++){
            add(nums[i]);
        }



        
    }
    
    public int add(int val) {
        if(pq.size()<k){
            pq.offer(val);
        }
        else if(pq.peek()<val){
            pq.poll();
            pq.offer(val);
        }

        return pq.peek();
        
    }
}
