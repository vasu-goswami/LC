class Solution 
{
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();

        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) i--;

        if (i < 0) return -1;

        int j = digits.length - 1;
        while (digits[j] <= digits[i]) j--;

        swap(digits, i, j);
        reverse(digits, i + 1, digits.length - 1);

        long val = Long.parseLong(new String(digits));
        return (val > Integer.MAX_VALUE) ? -1 : (int) val;
    }

    private void swap(char[] arr, int i, int j) {
        char tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
    }

    private void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char tmp = arr[i]; arr[i++] = arr[j]; arr[j--] = tmp;
        }
    }
}