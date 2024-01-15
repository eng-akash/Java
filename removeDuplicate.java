package Amazon;

public class removeDuplicate {
    public static int printNumber(int nums[]){
        int i=0;
        for (int j = 1; j<=nums.length-1; j++) {
            if(nums[i]<nums[j]){ //comparision
                // swapping
                int temp = nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i++;
            }

        }
        return i+1;
    }
    // main function
    public static void main(String[] args) {
        int nums[] = {0,1,1,1,2,2,3,6,9};
        System.out.println(printNumber(nums));

    }
}
