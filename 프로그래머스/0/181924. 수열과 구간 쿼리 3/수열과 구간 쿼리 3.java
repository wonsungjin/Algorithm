//1. for(int i = 0 ; i<queries.length;i++)을 돌려본다.
//2. temp = arr[queries[i][0]]; arr[queries[i][0] = arr[queries[i][1]; arr[queries[i][1] = temp; 하여 값을 바꾼다.
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int temp = 0;
        for(int i = 0 ; i<queries.length;i++){
            temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        return answer;
    }
}