// age를 자리수별로 switch에 넣음
// 그리고 숫자별로 answer에 더함
class Solution {
    public String solution(int age) {
        String answer2 = age+"";
        
        String answer = "";
        
        for(int i=0; i<answer2.length();i++)
        {
            switch(answer2.charAt(i))
            {
                case '0': answer+="a";
                    break;
                case '1': answer+="b";
                    break;
                case '2': answer+="c";
                    break;
                case '3': answer+="d";
                    break;
                case '4': answer+="e";
                    break;
                case '5': answer+="f";
                    break;
                case '6': answer+="g";
                    break;
                case '7': answer+="h";
                    break;
                case '8': answer+="i";
                    break;
                case '9': answer+="j";
                    break;
                default :
                    break;
            }
        }
        return answer;
    }
}