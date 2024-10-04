//1. boolean 하나 변수 false로 선언 하고 for 문돌리면서 if(n_str.charAt(i)!='0') 되면 true로함
//2. true 일시 answer에 n_str.charAt(i)를 더함;
class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean bl = false;
        for(int i = 0 ; i<n_str.length();i++)
        {
            if(n_str.charAt(i)!='0') bl =true;
            if(bl) answer+= n_str.charAt(i);
        }
        return answer;
    }
}