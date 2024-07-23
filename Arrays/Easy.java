
public class Easy{
    public static void main(String[] args) {

    }

    //Largest element in array

    class Solution {
        public static int largest(int n, int[] arr) {
            // code here
            int l = arr[0];
            for(int i = 0 ; i < n ; i++){
                if(arr[i] > l){
                    l = arr[i];
                }
            }
            return l;
        }
    }


    //Second largest element in Array
    public static int sLarge(int n , int a[]){
        int l = a[0];
        int sl = Integer.MIN_VALUE;
        for(int i = 1 ; i < n ; i++){
            if(a[i] > l){
                sl = l;
                l = a[i];
            }else if(a[i]<l && a[i]>sl){
                sl = a[i];
            }
        }
        return sl;
    }



    //Second smallest Element in array
    public static int sSmall(int n , int a[]){
        int s = a[0];
        int ss = Integer.MAX_VALUE;
        for(int i = 1 ; i < n ; i++){
            if(a[i]<s){
                ss = s;
                s = a[i];
            } else if(a[i]>s && a[i]<ss){
                ss = a[i];
            }
        }
        return ss;
    }


    //Check if array is sorted

    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i = 1 ; i < n ;i++){
            if(a[i] >= a[i-1]){
            }else{
                return 0;
            }
        }
        return 1;

    }


    //Remove duplicates from sorted array    [IMP REVISION]

    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int i = 0;
        for(int j = 1 ; j < n ; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }

}