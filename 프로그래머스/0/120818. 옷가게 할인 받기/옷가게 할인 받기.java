class Solution {
    public int solution(int price) {
        float answer = price;
        if(price>=500000) answer = price*0.8f;
        else if(price>=300000) answer = price*0.9f;
        else if(price>=100000) answer = price*0.95f;
        
        return (int)answer;
    }
}