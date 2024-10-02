class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        if(k%2 ==0)//짝수
        {
            for(int i = 0; i<arr.length;i++)
            {
                arr[i]=k+arr[i];
            }
        }
        else 
        {
            for(int i = 0; i<arr.length;i++)
            {
                arr[i]=k*arr[i];
            }   
        }
        return arr;
    }
}