package basic_code;

public class Insertion_Sort {
    public static void main(String[] args) {
        //shifting to right position the elements of array
        int [] nums = {2,9,6,8,4,3,7,5};
        int n = nums.length;
        for(int i=1 ; i<n ; i++){
            int key = nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        for(int i : nums){
            System.out.print(i + " ");
        }

    }
}
