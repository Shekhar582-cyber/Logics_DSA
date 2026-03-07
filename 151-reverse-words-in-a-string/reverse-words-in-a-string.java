class Solution {

    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ans = "";

        for(int i = arr.length - 1; i >= 0; i--){
            if(!arr[i].equals("")){   // skip empty strings
                ans += arr[i] + " ";
            }
        }

        return ans.trim();  // remove last space
    }
}