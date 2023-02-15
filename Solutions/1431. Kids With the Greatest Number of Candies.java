class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> ans = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for(int i=0; i < candies.length;i++){
            max = Math.max(max,candies[i]);
        }
        for(int i : candies){
            ans.add(i >= max -extraCandies);
        }
        return ans;
    }
}
