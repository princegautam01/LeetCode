import java.util.Arrays;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int num : nums){
            if(num != val)
            {
                nums[index++] = num;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
        
    }
    
}