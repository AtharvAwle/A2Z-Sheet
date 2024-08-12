public class bInarySearch1d {
    public static void main(String[] args) {

    }

    //BASIC BINARY SEARCH

//    1-Iterative
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }
        }

        return -1;
    }
    public static boolean binarySearchRecc(int[] arr , int start , int end,int target ){
        int mid = start+end/2;
        while (start <= end){
            if(arr[mid] != target){
                return false;
            } else if (arr[mid]  > target) {
                binarySearchRecc(arr,start,mid-1,target);
            }else {
                binarySearchRecc(arr,mid+1,end,target)
                }
            }
        return true;
        }
    }
}
