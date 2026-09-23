class Solution {

    private int findRow(int[][] matrix,int target){
        int m=matrix.length;
        int n=matrix[0].length;
        int ans=0;
        // we need the value>=target

        int start=0;
        int end= m-1;
        while(start <end){
            int mid=start+(end-start)/2;
            if(matrix[mid][n-1]<target){
                start=mid+1;    
            }
            else{   
                end=mid;
            }
            
        
        }
        return end;

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length;
        int n=matrix[0].length;

        int selectedRow= findRow(matrix,target);
        int start = 0;
        int end = n - 1;
        while (start <= end) { // Fixed: Changed from < to <=
            int mid = start + (end - start) / 2;
            
            if (target == matrix[selectedRow][mid]) {
                return true;
            } else if (target > matrix[selectedRow][mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }



        

        
        

        /*

        1. 
        first find the row by finding a last col element greater than given targe
        // we know the size and in one scan we can find the elem using a bs

        //once we get the row we can use a bs to find the middle element
         
         constraints:
         -> if empty matrix  then false;
         



         


        */

        

        


        

        // brut and optimal approach


        //tc and sc

        //edge cases



        
    
}
