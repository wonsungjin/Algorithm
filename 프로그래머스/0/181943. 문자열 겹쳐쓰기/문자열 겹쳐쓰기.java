//1. for을 s크기만큼 돌리면서 answer에 c을 더함
//2. overwrite_string의 크기만큼 for 돌려서 answer에 더함
//3. answer.length()에서 my_string.length() 만큼 for문 돌려서 answer에 더함
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i = 0; i<s; i++) answer+=my_string.charAt(i);
        for(int i = 0; i<overwrite_string.length();i++) answer+=overwrite_string.charAt(i);
        for(int i=answer.length(); i<my_string.length();i++) answer+=my_string.charAt(i);
        return answer;
    }
}