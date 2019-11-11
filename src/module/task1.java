package module;
import java.util.Arrays;

public class task1 {

    public int howManyUniques(int[] nums){
        if (nums.length <1){
            return 0;

        } else {
        int temp =1;
        //sort the array
        Arrays.sort(nums);

       //find uniques


        for (int i = 0; i < nums.length-1; i++) {

                if (nums[i] !=nums[i+1]){
                    ++temp ;
                }

            }


        return temp;

    }


}}
