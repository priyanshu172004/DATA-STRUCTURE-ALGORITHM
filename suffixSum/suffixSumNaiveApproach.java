package SuffixSum;
import java.util.ArrayList;
import java.util.List;

//Naive Approach TC : O(n*n)
public class suffixSumNaiveApproach{
    static ArrayList<Integer> toSuffixSum(int[] arr, int len){
        ArrayList<Integer> suffixSum = new ArrayList<>(len);
        for(int i = 0; i < len; i++){
            suffixSum.add(0);
        }
        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                suffixSum.set(i, suffixSum.get(i) + arr[j]);
            }
        }
        return suffixSum;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        int length = array.length;

        List<Integer> suffixSum = toSuffixSum(array,length);
        for(int e : suffixSum){
            System.out.print(e + " ");
        }
    }
}
