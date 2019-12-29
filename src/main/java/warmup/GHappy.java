package warmup;

public class GHappy {

    public boolean gHappy(String str) {
        if (str == null) {
            return false;
        }
        String enhancedStr = str + " ";
        boolean happy = true;
        for (int i = 0; i < enhancedStr.length(); i++) {
            if (enhancedStr.charAt(i) == 'g') {
                happy = false;
                if (enhancedStr.charAt(i + 1) == 'g') {
                    happy = true;
                    if (enhancedStr.charAt(i + 2) != 'g') {
                        i++;
                    }
                }
            }
        }
        return happy;
    }
}