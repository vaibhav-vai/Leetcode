// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/



class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }
        right++;

        while (left < right) {
            int mid = left + (right - left >> 1);
            int day = getDays(weights, mid);
            if (day <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int getDays(int[] weights, int limit) {
        int day = 1, sum = 0;
        for (int weight : weights) {
            if (sum + weight > limit) {
                sum = weight;
                day++;
            } else {
                sum += weight;
            }
        }
        return day;
    }
}
