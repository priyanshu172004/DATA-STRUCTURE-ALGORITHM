package PrefixSum;
import java.util.ArrayList;

public class prefixSum {
    static ArrayList<Integer> findPrefixSum(int[] arr){
        int length = arr.length;
        ArrayList<Integer> prefixSum = new ArrayList<>(length);
        for(int i = 0; i < length; i++){
            prefixSum.add(0);
        }

        prefixSum.set(0, arr[0]);
        for(int i = 1; i < length; i++){
            prefixSum.set(i , prefixSum.get(i - 1) + arr[i]);
        }
        return prefixSum;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        ArrayList<Integer> prefixSum = findPrefixSum(array);
        for(int i : prefixSum){
            System.out.print(i + " ");
        }
    }
}
