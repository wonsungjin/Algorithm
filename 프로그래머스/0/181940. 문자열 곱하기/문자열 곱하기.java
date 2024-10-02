//1. my_string을 k만큼 for문 돌려서  answer에 더한다.

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i =0 ; i<my_string.length();i++)
        {
           answer+= my_string.charAt(i);
            if(i==my_string.length()-1)
                if(k!=1) 
                {
                    k--;
                    i=-1;
                }
        }
        return answer;
    }
}