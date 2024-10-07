// 불값 모드 선언 일단 for문돌려서 코드를 하나씩 살펴봄
// 모드에 따라 모드가 켜져 있다면 홀수일 때 꺼져있다면 짝수일때 code[i]를 추가 
class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        for(int i = 0; i < code.length(); i++)
        {
            if(code.charAt(i) == '1') 
            {
                if(mode==true) mode=false;
                else mode = true;
                continue;
            }
            if(mode)
            {
                if(i%2==1) answer +=code.charAt(i);
            } 
            else
            {
                if(i%2==0) answer +=code.charAt(i);
            } 
        }
        return answer.length()==0 ? "EMPTY" : answer;
    }
}