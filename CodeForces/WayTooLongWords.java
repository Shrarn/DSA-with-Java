package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WayTooLongWords 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] word = new String[n];

        for(int i=0;i<n;i++){
            word[i] = br.readLine();
        }

        for(int i=0;i<n;i++)
        {
            if(word[i].length()>10)
            {
                word[i]=(word[i].charAt(0)+""+(word[i].length()-2)+""+word[i].charAt(word[i].length()-1));
            }
            else
            {
                word[i] = word[i];
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(word[i]);
        }        

    }
}