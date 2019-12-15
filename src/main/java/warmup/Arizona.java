package main.java.warmup;
// Here are warmup-2 practice task storred;

public class Arizona {
    public static void main(String[] args) {
        System.out.println("Arizona");
    }

    //stringTimes
    public String stringTimes(String str, int n) {
        if (str == null) {
            return str;
        }
        String stringTimes = "";
        for (int i = 0; i < n; i++) {
            stringTimes += str;
        }
        return stringTimes;
    }

    //frontTimes
    public String frontTimes(String str, int n) {
        if (str == null) {
            return str;
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            if (str.length() >= 3) {
                result += str.substring(0, 3);
            } else {
                result += str;
            }
        }
        return str;
    }

    //countXX
    int countXX(String str) {
        if (str == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                count++;
            }
        }
        return count;
    }

    //double X
    boolean doubleX(String str) {
        if (str == null) {
            return false;
        }
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

    //stringBits
    public String stringBits(String str) {
        if (str == null) {
            return str;
        }
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.substring(i, i + 1);
        }
        return result;
    }

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

    //last2
    public int last2(String str) {
        int count = 0;
        if (str == null) {
            return 0;
        }
        if (str.length() < 2) {
            return count;
        }
        String end = str.substring(str.length() - 2);
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(end)) {
                count++;
            }
        }
        return count;
    }

    //arrayCount9
    public int arrayCount9(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                counter++;
            }
        }
        return counter;
    }

    //arrayFront9
    public boolean arrayFront9(int[] nums) {
        int arrayLength;
        if (nums.length > 4) {
            arrayLength = 4;
        } else {
            arrayLength = nums.length;
        }
        for (int i = 0; i < arrayLength; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
}
