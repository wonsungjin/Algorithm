// 1. 문자열 이퀄스한다음  그냥 계산
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean b1 = false;
        if(ineq.equals(">"))
        {
            if(eq.equals("="))
            {
                if(n>=m) b1 =true;
            }
            else
            {
                if(n>m) b1 =true;
            }
        }
        else
        {
            if(eq.equals("="))
            {
                if(n<=m) b1 =true;
            }
            else
            {
                if(n<m) b1 =true;
            }
        }
        return (b1) ? 1 : 0;
    }
}