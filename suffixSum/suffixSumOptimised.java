package SuffixSum;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class suffixSumOptimised{
    static ArrayList<Integer> toSuffixSum(int[] arr, int len){
        ArrayList<Integer> suffixSum = new ArrayList<>(len);
        for(int i = 0; i < len; i++){
            suffixSum.add(0);
        }
        suffixSum.set(len-1, arr[len-1]);
        for(int i = len-2; i >= 0; i--){
            suffixSum.set(i, suffixSum.get(i+1) + arr[i]);
        }
        return suffixSum;
    }
    public static void main(String[] args){
        int[] array = {0,1,2,3};
        int length = array.length;
        ArrayList<Integer> suffixSum = toSuffixSum(array, length);
        for(int e : suffixSum){
            System.out.print(e + " ");
        }
    }
}
