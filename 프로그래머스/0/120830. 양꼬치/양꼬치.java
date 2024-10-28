//1. n>-10일때 n-10하고 k--
//2. answer = 12000*n+k*2000;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int i =n;
        while(i>=10)
        {
            i-=10;
            k--;
        }
        answer = 12000*n+k*2000;
        return answer;
    }
}