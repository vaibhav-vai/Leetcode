class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>(n);
        for(int i= 1; i < n+1; i++ ){
            boolean divisibleby3 = i%3==0;
            boolean divisibleby5 = i%5==0;

           /* if(divisibleby3 && divisibleby5 ){
                ans.add("FizzBuzz");
            }
            else if(divisibleby3){
                ans.add("Fizz");
            }
            else if(divisibleby5){
                ans.add("Buzz");
            }
            else{
                ans.add(String.valueOf(i));
            }*/

            String currStr = "";
            if(divisibleby3){
                currStr +="Fizz";
            }

            if(divisibleby5){
                currStr +="Buzz";
            }

            if(currStr.isEmpty()){
                currStr += String.valueOf(i);
            }
            ans.add(currStr);
        }

        return ans;
        
    }
}
