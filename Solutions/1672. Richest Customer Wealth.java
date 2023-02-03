class Solution {
    public int maximumWealth(int[][] accounts) {
        /*
        // person = rows
        // account = column
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person <accounts.length ; person++ ){
            // when you start a new row take a new sum for the row
            int sum=0;
            for(int account=0; account<accounts[person].length; account++){
                sum+= accounts[person][account];
            }
            // now we have the sum of the account of the person
            //check with the overall accounts of the person
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
        */
        int ans = Integer.MIN_VALUE;
        for(int[] person : accounts){
            int sum=0;
            for(int column : person){
                sum = sum + column;
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
