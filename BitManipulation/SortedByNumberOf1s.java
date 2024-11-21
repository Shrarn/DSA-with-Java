package BitManipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SortedByNumberOf1s {

    static int numberOf1s(int num)
    {
        
        int count = 0;

        while(num>0)
        {
            count = count + (num&1);
            num=num>>1;
        }

        return num;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of elements in the Array: ");
        int length = Integer.parseInt(br.readLine());

        int arr[] = new int[length];
        int count[] = new int[length];

        System.out.print("Enter the elements of array: ");

        for(int i=0;i<length;i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
            count[i] =  numberOf1s(arr[i]);
        }

        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i < length - 1; i++) 
        {
            for (int j = 0; j < length - i - 1; j++)
            {
                if(count[j]>count[j+1])
                {
                    temp1 = count[j];
                    count[j] = count[j+1];
                    count[j+1] = temp1;
                    
                    temp2 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp2;
                }
            }
        }

        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
