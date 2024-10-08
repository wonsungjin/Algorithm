class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0 ; i< answer.length;i++) answer[i] = -1;
        for(int i = 0 ; i<queries.length;i++){
            for(int j =queries[i][0]; j<=queries[i][1];j++)
            {
                if(queries[i][2]<arr[j])
                {
                    if(answer[i]>arr[j]||answer[i]==-1) answer[i] = arr[j];
                }
            }
        }
        return answer;
    }
}
