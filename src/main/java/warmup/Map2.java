package warmup;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    //word0 task
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }

    //wordLen task
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> wordLen = new HashMap<>();
        for (String s : strings) {
            wordLen.put(s, s.length());
        }

        return wordLen;
    }

    //pairs task
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> pairs = new HashMap<>();
        for (String s : strings) {
            pairs.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return pairs;
    }

    //wordCount task
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String string : strings) {
            int count = 0;
            for (String s : strings) {
                if (string.equals(s)) {
                    count++;
                    wordCount.put(s, count);
                }
            }
        }
        return wordCount;
    }
}
