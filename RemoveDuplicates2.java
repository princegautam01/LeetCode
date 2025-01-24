import java.util.Arrays;

public class RemoveDuplicates2 {
    public int removeDuplicates2(int[] nums) {
        int index = 1;
        int count = 0;
        for(int i =1;i<=nums.length-1;i++){
            if(nums[i]!=nums[i-1]){
                count = 0;
                nums[index++] = nums[i];
            }
            else{
                count++;
                if(count<=1){
                nums[index++] = nums[i];
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
}
