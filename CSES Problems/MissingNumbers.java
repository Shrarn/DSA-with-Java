import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MissingNumbers {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String number = br.readLine();
        StringTokenizer sb = new StringTokenizer(number, " ");
        long array[] = new long[n];
        long array2[] = new long[n+1];

        for(int i=0;i<n-1;i++)
        {
            array[i] = Integer.parseInt(sb.nextToken());
            array2[i]=0;
        }
        array2[n-1]=0;

        for(int i=0;i<n-1;i++)
        {
            array2[(int)array[i]] = 1;
        }

        for(int i=1;i<n;i++)
        {
            if(array2[i]==0)
                System.out.println(i);
        }
    }
}
