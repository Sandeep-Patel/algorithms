package linkedlist;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "hello  how are you! ";
        System.out.println(new ReverseWordsInString().reverseWords(s));
    }

    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }
        if (s.trim().length() == 0) {
            return "";
        }
        s = s.trim();
        String[] words = s.split(" ");

        if (words.length == 1) {
            return words[0].trim();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].trim().length() > 0) {
                sb.append(words[i].trim()).append(" ");
            }
        }

        String ans = sb.toString();

        return ans.trim();
    }
}