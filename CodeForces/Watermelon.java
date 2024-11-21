package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Watermelon 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  
        long n=Long.parseLong(br.readLine());
        
        if(n%2==0 && n>2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
       }
}