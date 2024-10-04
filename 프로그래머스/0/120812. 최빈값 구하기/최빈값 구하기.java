// 1.for문으로 array.length 까지 반복 
// 2.int a = new int[1000] 생성후 맞는 숫자에 카운트 올림
// a.length해서 젤 높은수 저장 2개이상 뜰시 -1 반환
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] a = new int[1000];
        int num1 = 0;
        int num2 = 0;
        for(int  i=0; i< array.length;i++) a[array[i]]++;
        for(int i = 0 ; i< a.length;i++)
        {
            if(num1<a[i]) 
            {
                num1=a[i];
                answer = i;
            }
            else if( num1==a[i]) 
            {
                num2 = a[i];
            }
        }
        return num1==num2 ? -1 : answer;
    }
}