// 1. for문 intStrs.length만큼 돌리고 for문  s에 l까지 answer[i]에 담음 
// 2. k보다 크다면 인트로 변환해서 list에 담음
import java.util.*;
class Solution {
    public ArrayList solution(String[] intStrs, int k, int s, int l) {
        String[] answer = new String[intStrs.length];
        ArrayList list = new ArrayList();
        for(int i=0; i<intStrs.length;i++)
        {
            answer[i] = "";
            for(int j = s; j<s+l; j++)
            {
                answer[i]+=intStrs[i].charAt(j);
            }
            System.out.println(answer[i]);
            if(k<Integer.parseInt(answer[i])) list.add(Integer.parseInt(answer[i]));
        }
        
        return list;
    }
}