// 1.denom1 과 denom2를 곱해서 같은 공배수로 만든다.
// 2.그리고 1000까지 for문돌려서 못나눌때까지 나눔
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int temp1=0;
        int temp2=0;
        temp1 = denom1;
        temp2 = denom2;

        denom1*=temp2;
        denom2*=temp1;
        numer1*=temp2;
        numer2*=temp1;

        numer1+=numer2;
        
        for(int i = 1 ; i<1000;i++)
        {
            if((denom1%i==0)&&(numer1%i==0))
            {
                denom1/=i;
                numer1/=i;
                i=1;
            }
        }
        answer[0] = numer1;
        answer[1] = denom1;
        return answer;
    }
}