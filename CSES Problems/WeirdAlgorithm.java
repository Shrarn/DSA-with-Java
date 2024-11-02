import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException
    {   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long i =Integer.parseInt(br.readLine());
        WeirdAlgorithm wa = new WeirdAlgorithm();
        wa.Algorithm(i);
        System.out.print("1");
    }

    void Algorithm(long m)
    {
        if(m==1)
        {
            return;
        }
        if(m%2==0)
        {
            System.out.print(m+" ");
            Algorithm(m/2);
        }
        else{
            System.out.print(m+" ");
            Algorithm((m*3)+1);
        }
    }    
}
