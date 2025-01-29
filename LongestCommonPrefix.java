import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
           if (strs == null || strs.length == 0) return "";
        
        // Sort the array
        Arrays.sort(strs);
        
        // Compare first and last string (they will have the least commonality)
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        
        return first.substring(0, i);
    }
}
