//1. nums를 for돌려서 ArrayList list 선언후 list.contains(nums[i])가 false라면 add
//2. list.size()>(nums.length/2)라면  nums.length/2리턴 아니면 list.size()리턴
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList list = new ArrayList();
        for(int i=0; i<nums.length;i++)
        {
            if(!list.contains(nums[i])) list.add(nums[i]);
        }
        return list.size()>(nums.length/2) ? nums.length/2 : list.size();
    }
}