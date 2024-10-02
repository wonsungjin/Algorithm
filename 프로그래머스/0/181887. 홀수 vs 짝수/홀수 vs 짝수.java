// 1.for문으로 num_list.length 돌려서 짝수번째 다더함,홀수번째 다더함
// 2.큰거 리턴
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        for(int i = 0; i< num_list.length; i++)
        {
            if(i%2==0) 
            {
                even += num_list[i];
            }
            else 
            {
                odd += num_list[i];
            }
        }
        return odd > even ? odd : even;
    }
}