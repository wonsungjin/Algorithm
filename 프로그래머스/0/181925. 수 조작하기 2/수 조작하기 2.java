//1. for문 돌려서 i+1이 numLog.length보다 크면 리턴
//2. numLog[i+1] - numLog[i] 를해서 1이면 w  -1이면 s 조건에 맞게 answer에 문자 더하기
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 0; i< numLog.length; i++)
        {
            if(i+1>=numLog.length) return answer;
            if(numLog[i+1]-numLog[i]==1) answer+="w";
            else if(numLog[i+1]-numLog[i]==-1) answer+="s";
            else if(numLog[i+1]-numLog[i]==10) answer+="d";
            else if(numLog[i+1]-numLog[i]==-10) answer+="a";
        }
            
        return answer;
    }
}