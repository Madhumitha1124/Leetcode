class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                count++;
            }
            }
        
        return count;
    }
}
  
  //without inbuild

// class Solution {
//     public int prefixCount(String[] words, String pref) {
//         int count = 0;
//         int n = pref.length();

//         for (int i = 0; i < words.length; i++) {
//             String word = words[i];

//             // If word is shorter than pref, it can't match
//             if (word.length() < n) continue;

//             boolean isPrefix = true;
//             for (int j = 0; j < n; j++) {
//                 if (word.charAt(j) != pref.charAt(j)) {
//                     isPrefix = false;
//                     break;
//                 }
//             }

//             if (isPrefix) count++;
//         }

//         return count;
//     }
// }
