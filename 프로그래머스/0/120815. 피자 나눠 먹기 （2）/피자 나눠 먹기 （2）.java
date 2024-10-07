//1. n/6이 
class Solution {
    public int solution(int n) {
        int answer = 0;
        float f = n;
        for(int i = 1;i<100;i++)
        {
            if((float)((6*i)/n)==(6*i)/f) 
            {
                answer = i;
                break;
            }
        }
        return answer;
    }
}