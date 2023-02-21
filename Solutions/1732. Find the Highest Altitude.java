class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int [gain.length + 1];
        for(int i = 0 ; i<gain.length; i++){
            arr[i+1] = gain[i] + arr[i];
        }
        int highestAltitude = highestAltitude(arr);
        return highestAltitude;
    }

    int highestAltitude(int [] arr){
        int highestAltitude = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if (highestAltitude < arr[i]){
                highestAltitude = arr[i];
            }
        }
        return highestAltitude;
    }
}
