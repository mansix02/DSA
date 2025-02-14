package Day3_array;

public class BinarySearch {
    
    public static int search(int nums[], int key) {
        int start=0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = (start+end)/2;

            if(nums[mid]==key){
                return mid;
            }
            if(nums[mid]<key){
                start = mid+1;
            }else{
                start = mid-1;
            }   
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,7,9};
        int key = 6;
        System.out.println(search(nums,key));
    }
    
}
