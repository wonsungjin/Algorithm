//1. 주어진 a.charAt(i)에 26을 더해서 대문자로변환 소문자는 -26
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0; i<a.length();i++)
        {
            if(a.charAt(i)<91) System.out.print((char)(a.charAt(i)+32));
            else System.out.print((char)(a.charAt(i)-32));
        }
    }
}