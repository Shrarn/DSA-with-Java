package Introductory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dna = br.readLine();
        long length = dna.length();
        long max_counter=0;
        long counter=0;
        for(long i=0;i<length-1;i++)
        {
            if(dna.charAt((int)i)==dna.charAt((int)i+1))
            {
                counter++;
                if(counter>=max_counter)
                    max_counter = counter;
            }
            else
            {
                counter=0;
            }
        }

        System.out.println((max_counter+1));
    } 
}
