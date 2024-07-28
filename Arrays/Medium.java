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



      //TRAPPED RAINWATER
      public static long getTrappedWater(long []arr, int n) {
          // Write your code here.
          long[] leftMax = new long[n];
          leftMax[0]=arr[0];
          for(int i = 1 ; i < n ; i++){
              leftMax[i] = Math.max(arr[i], leftMax[i-1]);
          }

          long[] rightMax = new long[n];
          rightMax[n-1] = arr[n-1];
          for(int i = n-2 ; i >= 0; i--){
              rightMax[i] = Math.max(arr[i], rightMax[i+1]);
          }

          long trapped = 0;
          for(int i = 0 ; i < n ; i++){
              long wl = Math.min(leftMax[i] , rightMax[i]);
              trapped = trapped + (wl - arr[i]);
          }
          return trapped;
      }
}
