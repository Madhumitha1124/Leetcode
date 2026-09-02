import java.util.*;

class StreamChecker {
    private TrieNode root;
    private StringBuilder stream;
    private int maxLen;

    public StreamChecker(String[] words) {
        root = new TrieNode();
        stream = new StringBuilder();
        maxLen = 0;
        for (String word : words) {
            insert(word);
            maxLen = Math.max(maxLen, word.length());
        }
    }

    private void insert(String word) {
        TrieNode node = root;
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
        }
        node.isWord = true;
    }

    public boolean query(char letter) {
        stream.append(letter);
        // keep stream length bounded by longest word
        if (stream.length() > maxLen) {
            stream.deleteCharAt(0);
        }

        TrieNode node = root;
        for (int i = stream.length() - 1; i >= 0; i--) {
            char c = stream.charAt(i);
            if (!node.children.containsKey(c)) return false;
            node = node.children.get(c);
            if (node.isWord) return true;
        }
        return false;
    }

    private static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isWord = false;
    }
}
