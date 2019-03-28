import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 * <p>
 * Example:
 * <p>
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note:
 * <p>
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
class Anagrams {

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = new Anagrams().groupAnagrams(strs);
        System.out.println("Output: " + res);
    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();

            Arrays.sort(charArray);
            String strVal = String.valueOf(charArray);

            if (!map.containsKey(strVal)) {
                map.put(strVal, new ArrayList<>());
            }
            map.get(strVal).add(str);
        }

        return new ArrayList<>(map.values());

    }


}