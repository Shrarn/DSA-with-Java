package Introductory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreasingArray {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long size = Integer.parseInt(br.readLine());
        long array[] = new long[(int)size];
        String array_content = br.readLine();
        long counter = 0;
        StringTokenizer sb = new StringTokenizer(array_content, " ");

        for(int i=0;i<size;i++)
        {
            array[i] = Long.parseLong(sb.nextToken());
        }

        for(int i = 1;i<size;i++)
        {
            if(array[i]<array[i-1])
            {
                counter = counter + (array[i-1]-array[i]);
                array[i] = array[i-1];
            }
        }

        System.out.print(counter);
    }
    
}