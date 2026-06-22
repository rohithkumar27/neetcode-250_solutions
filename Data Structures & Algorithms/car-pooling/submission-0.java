class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // The most reliable way to track carpooling is to record 
        // the net change of passengers at every stop.
        int[] timeline = new int[1001];

        for (int i = 0; i < trips.length; i++) {
            int passengers = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];
            
            // Passengers board here
            timeline[from] += passengers;
            // Passengers get off here
            timeline[to] -= passengers;
        }

        int current = 0;
        for (int i = 0; i <= 1000; i++) {
            current += timeline[i];
            if (current > capacity) {
                return false;
            }
        }

        return true;
    }
}