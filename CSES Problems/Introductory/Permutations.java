import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Permutations
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int input=Integer.parseInt(br.readLine());
        long counting = 1;
        long array[] = new long[input];

        if(input==2 || input==3)
        {
            System.out.print("NO SOLUTION");
            return;
        }

        for (int i=0;i<input;i++) {
            array[i] = counting++;
        }



            for(int j=0;j<input;j++)
            {
                if(array[j]%2!=0)
                {
                    System.out.print(array[j]+" ");
                }
            }

            
            for(int j=0;j<input;j++)
            {
                if(array[j]%2==0)
                {
                    System.out.print(array[j]+" ");
                }
            }
    }
}