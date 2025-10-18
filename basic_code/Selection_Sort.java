package basic_code;

public class Selection_Sort {
    public static void main(String[] args) {
        //minimum value at the start evertime we swap
        int [] nums = {1,5,7,2,3,4,9,6};
        for(int i=0 ; i<nums.length-1 ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
