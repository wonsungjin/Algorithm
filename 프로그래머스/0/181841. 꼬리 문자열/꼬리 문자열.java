//1. str_list를 for문 돌려서 answer에 더한다
//2. 더할때 ex의 문자랑 비교해서 일치하면 더하지않는다.
class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i=0;i < str_list.length; i++)
        {
            if(!str_list[i].contains(ex))
            answer += str_list[i]; 
        }
        return answer;
    }
}