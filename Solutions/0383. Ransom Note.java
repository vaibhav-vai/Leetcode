class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<>(); //k =26

        for(int i=0; i< magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = magazineLetters.getOrDefault(m,0);
            magazineLetters.put(m, currentCount+1);
        }

        // bounded by m
        for (int i=0; i< ransomNote.length(); i++) {
            char r= ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(r,0);

            if (currentCount == 0){
                return false;
            }

            magazineLetters.put(r, currentCount - 1);
        }

        return true;
    }
}
