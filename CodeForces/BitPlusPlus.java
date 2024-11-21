package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BitPlusPlus
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String arr[] = new String[t];
        int count = 0;

        for(int i=0;i<t;i++)
        {
            arr[i] = br.readLine();
        }

        
        for(int i=0;i<t;i++)
        {
            if(arr[i].charAt(0)=='+' || arr[i].charAt(arr[i].length()-1)=='+')
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        System.out.println(count);
    }
}