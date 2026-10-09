class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        
            dp=[False]*(len(s)+1)
            dp[0]=True;
            for index in range(1,len(s)+1):
                for item in wordDict:
                    if(dp[index]):
                        break
                    
                    if(index>=len(item) and s[index-len(item):index]==item):
                        dp[index]=dp[index-len(item)]
                        print(dp[index]);
            
            return dp[len(s)];

        
                    
               

        
        






