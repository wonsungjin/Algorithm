import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";
        for(int i=0; i<completion.length;i++)
        {
           if(!participant[i].equals(completion[i]))
           {
               answer = participant[i];
               break;
           }
        }
        if(answer.equals("")) return participant[participant.length-1];
        return answer;
         
    }
}