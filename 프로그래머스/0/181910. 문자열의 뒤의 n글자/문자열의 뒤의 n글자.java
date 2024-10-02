class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i =n; i>0; i--)
        {
            answer+= my_string.charAt(my_string.length()-i);
        }   
        return answer;
    }
}