class Solution {
    public boolean isPalindrome(String s) {
        String adjust = s.toLowerCase().replace(" ", "").replaceAll("[^a-zA-Z0-9]", "");
        int n = adjust.length();
        if (n % 2 == 0){
            String forward = adjust.substring(0, n/2);
            StringBuilder stringBuilder = new StringBuilder(adjust.substring(n/2));
            stringBuilder.reverse();
            String reverse = stringBuilder.toString();

            return forward.equals(reverse) ? true : false;

        } else {
            String forward = adjust.substring(0, n/2);
            StringBuilder stringBuilder = new StringBuilder(adjust.substring(n/2 + 1));
            stringBuilder.reverse();
            String reverse = stringBuilder.toString();

            return forward.equals(reverse) ? true : false;
        }
    }
}
