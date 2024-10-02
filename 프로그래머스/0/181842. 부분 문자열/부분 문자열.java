//1.str2에 str1이 str2.contains(str1)을 해서 확인
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        return str2.contains(str1) ? 1 : 0;
    }
}