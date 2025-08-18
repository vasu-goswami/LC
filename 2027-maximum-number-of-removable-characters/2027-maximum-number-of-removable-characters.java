class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int l = 0, r = removable.length, ans = 0;
        while (l <= r) {
            int m = (l + r) / 2;
            if (isSub(s, p, removable, m)) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    private boolean isSub(String s, String p, int[] rem, int k) {
        boolean[] rm = new boolean[s.length()];
        for (int i = 0; i < k; i++) rm[rem[i]] = true;
        int j = 0;
        for (int i = 0; i < s.length() && j < p.length(); i++) {
            if (!rm[i] && s.charAt(i) == p.charAt(j)) j++;
        }
        return j == p.length();
    }
}
