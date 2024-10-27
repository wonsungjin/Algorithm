//1.for문으로 n 까지 반복 돌림
//2.n%i를하여 0이되면 카운트 
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0) 
            {
                System.out.println(i);
           
                answer++;
            }
        }
        return answer;
    }
}