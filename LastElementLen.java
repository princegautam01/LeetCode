public class LastElementLen {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String[] words = s.split("\\W+");
        count = words[words.length-1].length();
    return count;
}
}
