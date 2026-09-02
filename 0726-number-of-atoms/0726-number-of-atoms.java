import java.util.*;

class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());
        int i = 0, n = formula.length();

        while (i < n) {
            char c = formula.charAt(i);

            if (c == '(') {
                stack.push(new HashMap<>());
                i++;
            } else if (c == ')') {
                i++;
                int start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int mult = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;

                Map<String, Integer> popped = stack.pop();
                Map<String, Integer> top = stack.peek();
                for (String key : popped.keySet()) {
                    top.put(key, top.getOrDefault(key, 0) + popped.get(key) * mult);
                }
            } else {
                // Parse element name
                int start = i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String name = formula.substring(start, i);

                // Parse number
                start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int num = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;

                Map<String, Integer> top = stack.peek();
                top.put(name, top.getOrDefault(name, 0) + num);
            }
        }

        Map<String, Integer> result = stack.pop();
        TreeMap<String, Integer> sorted = new TreeMap<>(result);
        StringBuilder sb = new StringBuilder();
        for (String key : sorted.keySet()) {
            sb.append(key);
            if (sorted.get(key) > 1) sb.append(sorted.get(key));
        }
        return sb.toString();
    }
}
