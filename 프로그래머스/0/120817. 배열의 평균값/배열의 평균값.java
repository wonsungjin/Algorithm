// 1. for문으로 numbers.length만큼 반복하면서 answer에 다더하고 length만큼 나눔
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0;i<numbers.length;i++) answer+=numbers[i];
        return answer/numbers.length;
    }
}