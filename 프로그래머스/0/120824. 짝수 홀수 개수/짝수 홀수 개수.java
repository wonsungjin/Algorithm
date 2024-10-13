// 1. num_list.length 크기만큼 루프
// 2. 짝수면 0배열 ++ 홀수면 1배열 ++ 원소값이 0이면 리턴
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i = 0 ; i<num_list.length;i++)
        {
            if(num_list[i]%2==0) answer[0]++;
            else if(num_list[i]%2==1) answer[1]++;
        }
        return answer;
    }
}