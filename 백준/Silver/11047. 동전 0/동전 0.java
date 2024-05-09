import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int coin = sc.nextInt();
		int count =0;
		int[] value = new int[num];
		for(int i=0;i<num;i++)
		{
			value[i] = sc.nextInt();
		}
		int c=value.length-1;
		while(coin>0)
		{
			if(coin>=value[c]) 
			{
				coin-=value[c];
				count ++;
			}
			else c--;
		}
		
		System.out.print(count);
		

	}

}