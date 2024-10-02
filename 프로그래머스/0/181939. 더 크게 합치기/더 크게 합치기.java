class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String st =  "";
        st = a+""+b;
        int aa = Integer.parseInt(st);
        st = b+""+a;
        int bb = Integer.parseInt(st);
        
        return aa>bb ? aa : bb;
    }
}