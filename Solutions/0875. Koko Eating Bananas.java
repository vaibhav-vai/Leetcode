// https://leetcode.com/problems/koko-eating-bananas/description/



class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = 1_000_000_000;
        int max = end;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            int count = calc(piles, mid);
            if (count > h) start = mid;
            else {
                if (mid + 1 < max && calc(piles, mid + 1) <= h) {
                    end = mid;
                    continue;
                }
                return start;
            }
        }
        
        if (calc(piles, start) <= h) return start;
        return end;
    }
    
    private int calc(int[] piles, double k) {
        int count = 0;
        for (int i : piles) {
            count += Math.ceil(i / k);
        }
        return count;
    }
}
