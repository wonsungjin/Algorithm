// 1. str1,  for문 돌림
// 2. 홀수면 str1,짝수면 str2를 answer에 더함
class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<str1.length();i++)
        {
                answer.append(str1.charAt(i));
                answer.append(str2.charAt(i));
        }
        return answer.toString();
    }
}