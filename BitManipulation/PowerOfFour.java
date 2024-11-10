package BitManipulation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PowerOfFour {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bit = Integer.parseInt(br.readLine());

        boolean result = isPowerOfFour(bit);

        if(result)
        {
            System.out.println("Power of Four!");
        }
        else
        {
            System.out.println("Not a Power of Four!");
        }
    }

    static boolean isPowerOfFour(int bit)
    {
        int bitMask = 0xAAAAAAAA;
        if(bit>0)
        {
            if(((bit & (bit-1)) == 0))
            {
                if((bit & bitMask)==0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else{
            return false;
        }
    }
}
