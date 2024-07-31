import java.util.*;

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

      //rearrange the number positive negative -VARIETY 1
      public int[] rearrangeArray(int[] nums) {
          int n = nums.length;
          int[] ans = new int[n];
          int pos = 0;
          int neg = 1;

          for(int i = 0 ; i < n ; i++){
              //agar positive num hai to ans arr ke positive index mai put karke index +2 for getting aur ek positive.
              if(nums[i] > 0){
                  ans[pos] = nums[i];
                  pos += 2;
                  //for negativr same approach
                  //kkarun neg cha ans index +2.
              } else{
                  ans[neg] = nums[i];
                  neg += 2;
              }
          }
          return ans;
      }



      //Leaders in an element
      public static List< Integer > superiorElements(int []a) {
          // Write your code here.
          List<Integer> list = new ArrayList<>();

          list.add(a[a.length-1]);

          for(int i=a.length-2; i>=0; i--){

              if(a[i]>a[i+1] && a[i]>list.get(list.size()-1)){

                  list.add(a[i]);

              }

          }

          return list;
      }



      //spiral matrix que
      public static void spiralPrint(int matrix[][]){
          if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
              return;
          }
          //Your code goes here
          int n = matrix.length;
          int m = matrix[0].length;

          int startR = 0;
          int startC = 0;
          int endR = n-1;
          int endC = m-1;
          while(startR <= endR && startC <= endC){
              //top
              for(int j = startC ;j <= endC ; j++ ){
                  System.out.print(matrix[startR][j]+ " ");
              }
              startR++;

              //right
              for(int i = startR ; i <= endR ; i++){
                  System.out.print(matrix[i][endC]+ " ");
              }
              endC--;

              //bottom
              if(startR <= endR){
                  for(int j = endC ; j>=startC ; j--){

                      System.out.print(matrix[endR][j]+ " ");
                  }
                  endR--;
              }

              //left
              if(startC <= endC){
                  for(int i = endR ; i >= startR ; i--){

                      System.out.print(matrix[i][startC]+ " ");
                  }
                  startC++;
              }

          }
          System.out.println();
      }


      //Sort zero and once
      public static void sortZeroesAndOne(int[] arr) {
          //Your code goes here
          int n = arr.length;
          int zero = 0;
          int one = 0;

          for(int i = 0 ; i < n ; i++){
              if(arr[i] == 0){
                  zero++;
              }else{
                  one++;
              }
          }

          for(int i = 0 ; i <zero ; i++){
              arr[i] = 0;
          }
          for(int i = zero ; i < arr.length ; i++){
              arr[i] = 1;
          }
      }





}
