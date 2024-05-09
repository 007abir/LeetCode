class Solution {
    public long maximumHappinessSum(int[] v, int k) {
        Arrays.sort(v);
        long ans = 0;
        int n = v.length - 1;
        int c = 0;
        while (n >= 0 && k > 0) {
            if (v[n] - c >= 0) {
                ans += v[n] - c;
            } else {
                break;
            }
            c++;
            n--;
            k--;
        }
        return ans;
    }
}