class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i= 0 ; i<my_string.length(); i++)
        {
            if(((i+1)%m)==c) answer += my_string.charAt(i);
            else if(m==c)
            {
                if(my_string.length()<=m)
                {
                    if(i!=0&&(i+1)%c==0) answer += my_string.charAt(i);
                }
                else if((i%m)==0) answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}