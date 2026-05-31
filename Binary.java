import java.util.*;
public class Binary {
    public static void main(String[] args){
        int[] arr = {-14,-10,34,38,45,67,89,};//sorted array
        int target =67;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
        
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start +(end - start)/2;//to avoid integer error
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
            }
            return -1;
        }
    }
    

