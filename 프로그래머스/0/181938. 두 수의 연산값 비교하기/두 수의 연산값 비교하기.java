class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = "";
        ab = a+""+b;
        
        return Integer.parseInt(ab)>(2*a*b) ? Integer.parseInt(ab) : (2*a*b);
    }
}