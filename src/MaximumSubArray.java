import java.util.Scanner;
public class MaximumSubArray {
    static int findMax(int[] array,int size,int b)
    {
        int sum = 0;
        int result = 0;
        for(int i=0;i<size;i++) {
            sum = 0;
            for(int j=0;j<size;j++)
            {
                if(sum+array[j] <= b)
                {
                    sum += array[i];
                }
            }
            if(result<sum)
            {
                result = sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int[] C=new int[A];
        for(int i=0;i<A;i++)
        {
            C[i]=scanner.nextInt();
        }
        int count=findMax(C,A,B);
        System.out.println(count);
    }
}
