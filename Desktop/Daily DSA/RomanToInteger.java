class Solution {
    public int romanToInt(String s) {

        int value = 0;
        int sum = 0;
        int no = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            switch (ch) {
                case 'I': no = 1; break;
                case 'V': no = 5; break;
                case 'X': no = 10; break;
                case 'L': no = 50; break;
                case 'C': no = 100; break;
                case 'D': no = 500; break;
                case 'M': no = 1000; break;
            }

            if (no < value) {
                sum -= no;
            } else {
                sum += no;
            }

            value = no;
        }

        return sum;
    }
}