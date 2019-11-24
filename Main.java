public class Main {
    public static void main(String[] args){
        System.out.println ("Test");
    }

    //sleapIn enchanced
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    //monkey trouble
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && !bSmile || !aSmile && bSmile) {
            return false;
        } return true;
    }

    //sumDouble
    public int sumDouble(int a, int b) {
        if (a==b) {
            return (a+b)*2;
        } return (a+b);
    }

    //sumDouble solution #2
    public int sumDouble(int a, int b) {
        return a == b ? ( a + b ) * 2 : a + b ;
    }


    //diff21
    public int diff21(int n) {
        if (n<21) {
            return 21-n;
        }return (n-21)*2;
    }

    //diff21 solution #2
    public int diff21(int n) {
        return n < 21 ? 21-n : (n-21)*2;
    }


    //parrotTrouble enchanced
    public boolean parrotTrouble (boolean talking, int hour) {
        return talking && (hour <7 || hour >20);
    }

    //makes10 enchanced
    public boolean makes10(int a, int b) {
        return (a+b)==10 || a==10 || b==10;
    }

    //nearHundred enchanced
    public boolean nearHundred (int n) {
        return Math.abs(n-100)<=10 || Math.abs(n-200)<=10;
    }

    //posNeg
    public boolean posNeg (int a, int b, boolean negative) {
        return a<0 && b>0 && !negative || a>0 && b<0 && !negative || a<0 && b<0 && negative;
    }

    //posNeg solution #2
    public boolean posNeg(int a, int b, boolean negative) {
        if (a>0 && b<0 && !negative) {
            return true;
        } else if (a<0 && b>0 && !negative) {
            return true;
        } else if (a<0 && b<0 && negative) {
            return true;
        }   return false;
    }

    //notString enchanced
    public String notString (String str) {
        if (!str.equals("") && str.length() >=3 && str.substring (0, 3).equals("not")) {
            return str;
        } return "not " + str;
    }

    //stringTimes
    public String stringTimes(String str, int n) {
        String stringTimes = "";
        for (int i=0; i<n; i++) {
            stringTimes += str;
        }
        return stringTimes;
    }

    //loneTeen
    public boolean loneTeen(int a, int b) {
        return (a >=13 && b <13 || a <=19 && b >19) || (a <13 && b >=13 || a >19 && b <=19);

    }

    //stringYak
    public String stringYak(String str) {
        String result = "";

        for (int i=0; i<str.length(); i++) {
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                i =  i + 2;
            } else {
                result = result + str.charAt(i);
            }
        }

        return result;
    }
}
