//while돌려서 hp>0까지 반복
class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp>0)
        {
            if(hp>=5)
            {
                hp-=5;
                answer++;
            }
            else if(hp>=3)
            {
                hp-=3;
                answer++;
            }
            else if(hp>0)
            {
                hp--;
                answer++;
            }
        }
        return answer;
    }
}