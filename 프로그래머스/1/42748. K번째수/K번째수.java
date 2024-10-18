//1. commands.length만큼 for 반복
//2.  commands[i][0]에서 commands[i][1]만큼 반복하여 list에 담고 sort후 list.get(commands[i][2]);를 answer에 담음
import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();
        int count=0;
        for(int i = 0 ;i<commands.length;i++){
            for(int j=commands[i][0]-1;j<commands[i][1];j++)
            {
                list.add(array[j]);
            }
            
            Collections.sort(list);
            System.out.print(list);
            answer[count++] = list.get(commands[i][2]-1);
            
            list = new ArrayList();
        }
        return answer;
    }
}