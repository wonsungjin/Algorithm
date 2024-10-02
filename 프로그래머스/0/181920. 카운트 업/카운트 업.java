class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        int count = 0;
        answer = new int[(1+end_num)-start_num];
        for(int i = start_num ; i<end_num+1;i++)
        {
            answer[count] = i;
             count++;
        }
        return answer;
    }
}