class Solution {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int l = 0;
        int j = s.length() - 1;

        while (l < j) {

            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }

            if (s.charAt(l) != s.charAt(j)) {
                return false;
            }

            l++;
            j--;
        }

        return true;
    }
}