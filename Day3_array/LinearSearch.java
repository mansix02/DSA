package Day3_array;

public class LinearSearch{

    public static int search(int nums[], int key) {
        for(int i=0; i<=nums.length; i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,3,6,7,9};
        int key = 6;
        System.out.println(search(nums,key));
    }
}
