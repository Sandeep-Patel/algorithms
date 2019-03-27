package linkedlist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionParagraph {

    public static void main(String[] args) {
        String s= "rwer er erew ew rwe";
        String[] b = {"sd"};
        System.out.println(new SolutionParagraph().mostCommonWord(s,b));
    }
    public String mostCommonWord(String paragraph, String[] banned) {

        Map<String,Integer> map = new HashMap<>();
        
        paragraph = paragraph.replace(".","");
        paragraph = paragraph.replace("!","");
        paragraph = paragraph.replace(",","");
        paragraph = paragraph.replace("?","");
        paragraph = paragraph.replace("\'","");
        paragraph = paragraph.replace(";","");
        
        String[] wordList = paragraph.split(" ");
        List<String> bannedList = Arrays.asList(banned);
        
        for(String word: wordList) {
            word = word.toLowerCase();
            word = word.trim();
            if(!"".equals(word) && !bannedList.contains(word)) {
                if(map.get(word)!=null) {
                    map.put(word, map.get(word)+1);
                } else {
                    map.put(word,1);
                }
            }
        }
        
        int max = 0;
        String maxKey = null;
        
        for(String key: map.keySet()) {
            if(map.get(key)>max) {
                max=map.get(key);
                maxKey = key;
            }
        }
            
        return maxKey;
    }
}