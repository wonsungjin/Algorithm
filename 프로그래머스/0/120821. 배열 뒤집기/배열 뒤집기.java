//1.for문으로 뒤집기
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = num_list;
        int temp = 0;
        int cur = answer.length-1;
        for(int i = 0 ; i<answer.length/2;i++)
        {
            temp = answer[cur];
            answer[cur] = answer[i]; 
            answer[i] = temp;
            cur--;
        }
        return answer;
    }
}