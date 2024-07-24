import java.util.*;
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

//    Reverse the array
    public void reverseArray(int arr[],int n){
        //Take two pointers "FIRST" "LAST"
//        swap them with each other
        int first = 0;
        int last = n-1;

        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }


//    REVERSE THE ARRAY AFTER M index

    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int n = arr.size();
        int f = m+1;
        int l = n-1;

        while(f<l){
            int temp = arr.get(f);
            arr.set(f, arr.get(l));
            arr.set(l, temp);
            f++;
            l--;
        }
    }


//    ROTATE ARRAY BY ONE
public void rotate(int[] arr) {
    // code here
    int n = arr.length;
    int temp = arr[n-1];
    for(int i = n-2 ; i >= 0 ;i--){
        arr[i+1] = arr[i];
    }
    arr[0] = temp;
}

}