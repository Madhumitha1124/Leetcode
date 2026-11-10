class Solution {
    public String reorderSpaces(String text) {
        String[] word = text.trim().split("\\s+");

        int spc = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spc++;
            }
        }

        // only one word
        if (word.length == 1) {
            StringBuilder ans = new StringBuilder(word[0]);

            for (int i = 0; i < spc; i++) {
                ans.append(" ");
            }

            return ans.toString();
        }

        int sp = spc / (word.length - 1);
        int rem = spc % (word.length - 1);

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < word.length; i++) {
            ans.append(word[i]);

            if (i != word.length - 1) {
                for (int j = 0; j < sp; j++) {
                    ans.append(" ");
                }
            }
        }

        for (int i = 0; i < rem; i++) {
            ans.append(" ");
        }

        return ans.toString();
    }
}