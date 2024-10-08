import java.util.*;
class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<arr.length)
        {
            if(list.size()==0) {
                list.add(arr[i]);
                i++;
           }
            else if(list.get(list.size()-1)<arr[i]) 
                 {
                list.add(arr[i]);
                i++;
           }
            else
            {
                list.remove(list.get(list.size()-1));
            }
            
        }
        return list;
    }
}