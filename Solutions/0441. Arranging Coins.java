// https://leetcode.com/problems/arranging-coins/


class Solution {
    public int arrangeCoins(int n) {
        long l=1;
        long r=n;
        long res=0;
        
        while(l<=r){
            long mid = l+(r-l)/2;
            long sum = ((mid)*(mid+1))/2;
            if(sum>n){
                r=mid-1;
            }else{
                l=mid+1;
                res=Math.max(res,mid);
            }
        }
        
        return (int)res;
    }
}
