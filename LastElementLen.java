public class LastElementLen {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String[] words = s.split("\\W+");
        count = words[words.length-1].length();
    return count;
}
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        LastElementLen le = new LastElementLen();
        int count = le.lengthOfLastWord(str);
        System.out.println(count);
    }
}
