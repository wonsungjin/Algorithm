//1. for돌려서 true 인 애들만 answer에 더하는데 i가 0일때 frist bl값 true로 해줌.
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i = 0; i <  included.length; i++) 
        {
            if(included[i]==true) 
            {
                answer+=a+d*i;
            }
        }
        return answer;
    }
}