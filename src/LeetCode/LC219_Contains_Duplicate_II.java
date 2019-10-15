package LeetCode;

//219. Contains Duplicate II
//https://leetcode.com/problems/contains-duplicate-ii/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC219_Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /*
        if (nums == null || nums.length == 0) return false;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
        }

        return false;
        */

        if (nums == null || nums.length == 0) return false;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) set.remove(nums[i - k]);
        }
        return false;

    }
}
