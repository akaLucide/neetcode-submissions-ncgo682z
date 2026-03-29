class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> haveSeen = new HashMap<>();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int missing = target - nums[i];

            if (haveSeen.containsKey(missing)) {
                answer[0] = haveSeen.get(missing);
                answer[1] = i;
                return answer;
            }
            else {
                haveSeen.put(nums[i], i);
            }
        }
        return answer;
    }
}
