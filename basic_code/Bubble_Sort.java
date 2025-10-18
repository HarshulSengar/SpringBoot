package basic_code;

public class Bubble_Sort {
    public static void main(String[] args) {
        //largest value at the end everytime by swapping
        int [] nums = {1,9,7,8,3,4,6};
        for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<nums.length-1-i ; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
