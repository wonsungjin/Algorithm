
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());
        int num = 0;
        if(sugar ==4||sugar==7 ){System.out.println("-1");return;}
        while(sugar!=0)
        {
            if(sugar>=5)
            {
                sugar -=5;
                num++;
            }
            else if(sugar>=3)
            {
                sugar -=3;
                num++;
            }
            else
            {
                sugar+=5;
                num--;
                if(sugar>=3)
                {
                    sugar -=3;
                    num++;
                }
                else{
                num=-1;
                break;
                }
            }

        }
        System.out.println(num);
   }
}