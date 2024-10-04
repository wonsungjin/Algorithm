
//1. babbling.length; 만큼 for문돌림
//2. babbling[i]에서 "aya", "ye", "woo", "ma"들을 replace(단어,"");함
//3. 해당 babling[i].length()==0 이면 카운트함
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int count=0;
        for(int i=0; i<babbling.length;i++)
        {
            babbling[i] = babbling[i].replace("aya"," ");
            babbling[i] = babbling[i].replace("ye"," ");
            babbling[i] = babbling[i].replace("woo"," ");
            babbling[i] = babbling[i].replace("ma"," ");
            System.out.println(babbling[i]);
            for(int j = 0 ; j<babbling[i].length();j++)
            {
                if(babbling[i].charAt(j)==' ') count++;
                if(count==babbling[i].length()) answer++;
            }
            count=0;
        }
        return answer;
    }
}