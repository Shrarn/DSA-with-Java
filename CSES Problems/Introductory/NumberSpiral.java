package Introductory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NumberSpiral 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long x,y;
        while(t>0)
        {
            y = Integer.parseInt(br.readLine());
            x = Integer.parseInt(br.readLine());

            char max = (y>=x)?'y':'x';
            if(max=='y')
            {
                if(y%2==0)
                {
                    y*=y;
                    y=y-(x-1);
                }
                else{
                    --y;
                    y*=y;
                    y++;
                    y=y+(x-1);
                }
                System.out.println(y);
            }
            else
            {
                if(x%2!=0)
                {
                    x*=x;
                    x=x-(y-1);
                }
                else{
                    --x;
                    x*=x;
                    x++;
                    x=x+(y-1);
                }
                System.out.println(x);
            }
            t--;
        }
    }
}