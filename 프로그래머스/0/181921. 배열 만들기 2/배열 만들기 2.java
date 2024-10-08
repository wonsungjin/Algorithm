import java.util.*;
class Solution {
    public ArrayList solution(int l, int r) {
        int[] answer = {};
        ArrayList list = new ArrayList();
        for(int i=l; i<=r;i++)
        {
                if(!(i+"").contains("1")&&
                  !(i+"").contains("2")&&
                  !(i+"").contains("3")&&
                  !(i+"").contains("4")&&
                  !(i+"").contains("6")&&
                  !(i+"").contains("7")&&
                  !(i+"").contains("8")&&
                  !(i+"").contains("9")) list.add(i);
        }
        if(list.size()==0) list.add(-1);
        return list;
    }
}