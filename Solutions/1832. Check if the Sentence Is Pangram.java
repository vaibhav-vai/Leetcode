class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr= new boolean[26];

        for(int i=0; i< sentence.length();i++){
            arr[sentence.charAt(i) - 97] = true;
        }

        for(int i = 0; i <26 ; i++){
            if(arr[i] == false){
                return false;
            }
        }
        return true;
    }
}
