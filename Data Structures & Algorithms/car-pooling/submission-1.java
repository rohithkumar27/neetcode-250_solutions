class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int cur=0;
        Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            return Integer.compare(a[0], b[0]); 
        });

        for(int i=0;i<trips.length;i++){
            int c = trips[i][0], s = trips[i][1], f = trips[i][2];
            while(!minHeap.isEmpty() && minHeap.peek()[0] <= s) {
                cur = cur - minHeap.poll()[1];
            }
            cur = cur + c;
            if (cur > capacity) return false;
            minHeap.offer(new int[]{f, c});
        }

        return true;
    }
}