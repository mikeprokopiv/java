package warmup;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    //word0 task
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (s != null) {
                map.put(s, 0);
            }
        }
        return map;
    }

    //wordLen task
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> wordLen = new HashMap<>();
        for (String s : strings) {
            if (s != null) {
                wordLen.put(s, s.length());
            }
        }
        return wordLen;
    }

    //pairs task
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> pairs = new HashMap<>();
        for (String s : strings) {
            if (s != null && s.length() != 0) {
                pairs.put(s.substring(0, 1), s.substring(s.length() - 1));
            }
        }
        return pairs;
    }

    //wordCount task
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String string : strings) {
            int count = 0;
            for (String s : strings) {
                if (string != null && string.equals(s)) {
                    count++;
                    wordCount.put(s, count);
                }
            }
        }
        return wordCount;
    }

    //firstChar task
    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<String, String>();


        for (String currentString : strings) {
            if (currentString != null && currentString.length()!=0) {
                String firstLetter = currentString.substring(0, 1);

                if (map.containsKey(firstLetter)) {
                    map.put(firstLetter, map.get(firstLetter) + currentString);
                } else {
                    map.put(firstLetter, currentString);
                }
            }
        }
        return map;

    }


    public static void main(String[] args) {
        String[] strings = {"red", "blue", "red", "red", "blue", "", null};
        //"a": "appleaardvark", "b": "bellsbellsbells", "s": "saltsun", "z": "zen"
        //{a=appleaardvark, b=bellsbells, s=saltsun, z=zen}
        Map2 InstanceOfMap2Class = new Map2();
        // System.out.println("Result of word0 method is hash map - " + InstanceOfMap2Class.word0(strings));
        // System.out.println("Result of wordLen method is hash map - " + InstanceOfMap2Class.wordLen(strings));
        //  System.out.println("Result of wordCount method is hash map - " + InstanceOfMap2Class.wordCount(strings));
        System.out.println("Result of firstChar method is hash map - " + InstanceOfMap2Class.firstChar(strings));

    }

}
