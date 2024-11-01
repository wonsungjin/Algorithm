import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        if (share == 0 || balls == share) return 1;
        
        return factorial(balls).divide(factorial(share).multiply(factorial(balls - share))).intValue();
    }

    private BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
