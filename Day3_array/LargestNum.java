package Day3_array;

public class LargestNum {

    public static int largest(int nums[]){
        int largestNum = Integer.MIN_VALUE;
        int smallestNum = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(largestNum<nums[i]){
                largestNum = nums[i];
            }
            if(smallestNum>nums[i]){
                smallestNum = nums[i];
            }
        }
        System.out.println(largestNum);
        return smallestNum;
    }
    
    public static void main(String[] args) {
        int nums[]={2,1,3,7,9,10,5};
        System.out.println(largest(nums));
    }
}
