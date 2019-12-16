package warmup;

public class Nevada {
    //stringSplosion
    public String stringSplosion(String str) {
        if (str == null) {
            return str;
        }
        String result = "";
        for (int i = 0; i <= str.length(); i++) {
            result += str.substring(0, i);
        }
        return result;
    }
}