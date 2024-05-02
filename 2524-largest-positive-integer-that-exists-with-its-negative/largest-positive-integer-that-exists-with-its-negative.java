class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for (int i : nums) st.add(i);
        int res = -1;
        for (int p : nums)
             if (p > 0 && st.contains(-p)) res = Math.max(res, p);
        return res;
    }
}