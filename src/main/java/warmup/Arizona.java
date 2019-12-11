package main.java.warmup;
// Here are warmup-2 practice task storred;

public class Arizona {
    public static void main(String[] args) {
        System.out.println("Arizona");
    }
    //double X
    boolean doubleX(String str) {
        if (str.length() > 0) {
            int x = str.indexOf("x");
            if (x == -1) {
                return false;
            }
            if (x + 1 < str.length()) {
                return str.substring(x + 1, x + 2).equals("x");
            } else {
                return false;
            }
        }
        return false;
    }

    //stringBits
    public String stringBits(String str) {
        if (str.length() > 0) {
            String result = "";
            for (int i = 0; i < str.length(); i += 2) {
                result += str.substring(i, i + 1);
            }
            return result;
        }
        return str;
    }

    //stringSplosion
    public String stringSplosion(String str) {
        if (str.length() > 0) {
            String result = "";
            for (int i = 0; i <= str.length(); i++) {
                result += str.substring(0, i);
            }
            return result;
        }
        return str;
    }


}
