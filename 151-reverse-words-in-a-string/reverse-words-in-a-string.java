class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') i--;   // skip spaces
            int j = i;

            while (i >= 0 && s.charAt(i) != ' ') i--;   // find word start

            if (j >= 0) {
                if (res.length() > 0) res.append(" ");
                res.append(s.substring(i + 1, j + 1));
            }
        }

        return res.toString();
    }
}