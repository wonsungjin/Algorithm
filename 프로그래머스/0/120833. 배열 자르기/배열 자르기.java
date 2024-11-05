
//1. for문으로  num1에서 num2까지 돌리면서 새로운 리스트에 add한다.
import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = num1 ; i<=num2;i++)
            list.add(numbers[i]);
            
        return list;
    }
}