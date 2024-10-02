import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st = "";
        if(n%2==0) st =n+" is even";
        else st =n+" is odd";
        System.out.print(st);
    }
}