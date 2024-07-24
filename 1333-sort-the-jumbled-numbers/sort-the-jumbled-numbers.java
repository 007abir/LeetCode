class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length, k = 0;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; ++i)
            indices[i] = i;
        Arrays.sort(indices, Comparator.comparing(i -> convert(nums[i], mapping)));
     // return Stream.of(indices).mapToInt(i -> nums[i]).toArray();
        int[] ans = new int[n];
        for (int idx : indices)
            ans[k++] = nums[idx];
        return ans;
    }
    private int convert(int num, int[] mapping) {
        if (num == 0)
            return mapping[0];
        int n = 0, f = 1;
        while (num > 0) {
            n += mapping[num % 10] * f;
            f *= 10;
            num /= 10;
        }
        return n;
    }
}