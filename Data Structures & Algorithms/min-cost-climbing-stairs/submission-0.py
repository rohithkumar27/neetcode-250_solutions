class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        dp=[0]*(len(cost)+1)
        dp[0]=0
        dp[1]=0;
        for i in range(2,len(cost)+1):
            dp[i]=min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2])
            print(dp)
        return dp[len(cost)]


        # dry run
        # len(cost)=3
        # 2->3
        # dp[2]-> min(2,1)=1
        #dp[3]-> min(1+2,0+2)->2

        #dp[2]->(1,2)->1
        






        