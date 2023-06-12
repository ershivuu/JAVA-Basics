/*
LeetCode Question
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/
class Solution {
    public int searchInsert(int[] a, int target) {
        
				int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < target) {
				count = i;
				count = count + 1;
			} else if (a[i] == 0)
				count = 0;
			else if (a[i] < 0)
				count = count - 1;

		}
		return count;
    }
}