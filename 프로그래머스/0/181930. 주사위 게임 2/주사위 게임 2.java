class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        return (a!=b&&b!=c&&a!=c) ? (a+b+c) : (a!=b||b!=c||c!=a) ? (a+b+c)*(a*a+b*b+c*c) : (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
    }
}