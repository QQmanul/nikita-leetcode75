package ru.nikita.problem283;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int steps = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i] == 0) {
                steps++;
            } else if(steps > 0 ) {
                nums[i - steps] = nums[i];
            }
        }

        if(steps > 0) {
            while (steps > 0) {
                nums[len - steps--] = 0;
            }
        }
    }
}
