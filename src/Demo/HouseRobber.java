package Demo;

import java.util.*;

public class HouseRobber {

    public static int rob(int[] nums) {

        int prev2 = 0;
        int prev1 = 0;

        for (int money : nums) {

            // Rob current house
            int robCurrent = prev2 + money;

            // Skip current house
            int skipCurrent = prev1;

            int current = Math.max(robCurrent, skipCurrent);

            // Move forward
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {

        int[] nums = {2,7,9,3,1};

        System.out.println("Maximum amount robbed : "+rob(nums));

    }
}


//o/p:-
//Maximum amount robbed : 12
