class Solution {
    public String reverseWords(String s) {
        ArrayList<String> words = new ArrayList<>();

        int i = 0;
        int l = s.length();

        while(i < l) {
            while(i < l && s.charAt(i) == ' ') {
                i++;
            }

            if(i < l) {
                int firstPos = i;

                while(i < l && s.charAt(i) != ' ') {
                    i++;
                }

                words.add(s.substring(firstPos, i));
            }
        }

        StringBuilder ans = new StringBuilder();

        for(int j = words.size() - 1; j > -1; j--) {
            if(j != 0) {
                ans.append(words.get(j) + " ");
            }else {
                ans.append(words.get(j));
            }
        }

        return ans.toString();
        
    }
}