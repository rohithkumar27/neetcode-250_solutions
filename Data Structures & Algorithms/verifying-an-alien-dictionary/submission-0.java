class Solution {
    public Map<Character,Integer> mp = new HashMap<>();

    public boolean check(String left,String right,int index){
        

        int a=left.length()-index;
        int b= right.length()-index;
        if(a==0 && b==0){
            return true;
        }
        //if left beocmes empy and right becomes 
        if(a==0 && b!=0){
            return true;   
        }

        if(a!=0 && b==0 ){
            return false;

        }

            char l=left.charAt(index);
            char r=right.charAt(index);
            if(mp.get(l)<mp.get(r)){
                return true;
            }
            else if(mp.get(l)==mp.get(r)){
               return check(left,right,index+1);
            }
            else{
                return false;
            }
        }

        
    

    public boolean isAlienSorted(String[] words, String order) {
        int i=0;
        for (char c :order.toCharArray()){
            mp.put(c,i);
            i++;
        }
        boolean flag=true;
        for(int k=0;k<=words.length-2;k++){
            if(!check(words[k],words[k+1],0)){
                return false;
            }           
        }

        return true;


        // how do we actually check if the word is sorted or not?
        // I can maintain and char and index ranking map <char,index>
        //while(size<size of smallest word){
          //get the frstword of all the ewored in the array and check the order with the idndex
    //so if the values are same then we go what if any tow d

    //for it to be sorted you first check if the relative order of the wore diwtits afjec workes isrgiht nor not

    //  is it two pair slidng wind and check if the order is right now not so O(N
    //  -> is the firstone is smallethan later one a function to check
    //  -> so if the check of the 
    //  )


                
    // 



    }

}

        

        
    
