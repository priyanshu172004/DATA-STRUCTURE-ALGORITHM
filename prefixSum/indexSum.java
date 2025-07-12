package PrefixSum;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class indexSum {
    static int findIndexSum(int[] arr, int start, int end, int length){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = {1,1,1,1,1};
        int start = input.nextInt();
        int end = input.nextInt();
        int length = array.length;
        if(start >= 0 && end <= length){
            int indexSum = findIndexSum(array, start, end, length);
            System.out.println("Index Sum : ");
            System.out.println(indexSum);
        }else{
            System.out.println("Index Out Of Range");
        }

    }
}
