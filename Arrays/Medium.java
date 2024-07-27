public class Medium {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

    }


//    MAXIMUM SUBARRAY SUM
//    KADANES ALGORITHM
public static long maxSubarraySum(int[] arr, int n) {
    // write your code here
    long cs = 0;
    long ms = Integer.MIN_VALUE;

    for(int i = 0 ; i < n ; i++){
        cs = cs + arr[i];
        //check if current sum is greater than max sum the make the maxsum the current sum
        if(cs > ms){
            ms = cs;
        }
        //If current sum is negative make it 0
        if(cs < 0){
            cs = 0;
        }

    }
    return ms;
}
}
