package org.example.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSumTest {

    @Test
    public void test_case_one(){
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int[] rsp = calculate(nums, target);

        int[] rspExpected = new int[]{0, 1};

        Assert.assertArrayEquals(rsp, rspExpected);
    }

    @Test
    public void test_case_two(){
        int[] nums = new int[]{3,2,4};
        int target = 6;

        int[] rsp = calculate(nums, target);

        int[] rspExpected = new int[]{1, 2};

        Assert.assertArrayEquals(rsp, rspExpected);
    }

    @Test
    public void test_case_three(){
        int[] nums = new int[]{3,3};
        int target = 6;

        int[] rsp = calculate(nums, target);

        int[] rspExpected = new int[]{0, 1};

        Assert.assertArrayEquals(rsp, rspExpected);
    }

    @Test
    public void test_case_four(){
        int[] nums = new int[]{3,2,3};
        int target = 6;

        int[] rsp = calculate(nums, target);

        int[] rspExpected = new int[]{0, 2};

        Assert.assertArrayEquals(rsp, rspExpected);
    }

    @Test
    public void test_case_five(){
        int[] nums = new int[]{3,2,4,1,5,9};
        int target = 12;

        int[] rsp = calculate(nums, target);

        int[] rspExpected = new int[]{0, 5};

        Assert.assertArrayEquals(rsp, rspExpected);
    }

    public int[] calculate(int[] nums, int target){
        Map<Integer,Integer> aux = new HashMap<>();
        int[] rsp = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
            if (aux.containsKey(search)){
                rsp[0] = aux.get(search);
                rsp[1] = i;
                break;
            }
            aux.put(nums[i], i);
        }
        return rsp;
    }
}
