package com.prokopim.java.warmup;

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
        }
        return true;
    }

    //sumDouble
    public int sumDouble(int a, int b) {
        if (a==b) {
            return (a+b)*2;
        }
        return (a+b);
    }

    //sumDouble solution #2
    public int sumDouble2(int a, int b) {
        return a == b ? ( a + b ) * 2 : a + b ;
    }


    //diff21
    public int diff21(int n) {
        if (n<21) {
            return 21-n;
        }
        return (n-21)*2;
    }

    //diff21 solution #2
    public int diff212(int n) {
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
    public boolean posNeg2(int a, int b, boolean negative) {
        if (a>0 && b<0 && !negative) {
            return true;
        } else if (a<0 && b>0 && !negative) {
            return true;
        } else if (a<0 && b<0 && negative) {
            return true;
        }
            return false;
    }

    //notString enchanced
    public String notString (String str) {
        if (!str.equals("") && str.length() >=3 && str.substring (0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
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

    //missing char
    public String missingChar (String str, int n) {
        if (str.length() <= 0 && n >= 0) {
            return str.substring(0, n) + str.substring(n + 1, str.length();
        }
    }


    //frontBack
    public String frontBack (String str) {
        if (str.length()>0){
            if (str.length()>1) {
                String firstLetter = str.substring(0,1);
                String lastLetter = str.substring(str.length()-1,str.length());
                return str=lastLetter+str.substring(1,str.length()-1)+ firstLetter;
            }
            return str;
        }
        return str;
    }

    //front3
    public String front3 (String str) {
        String sub = str.substring(0,3);
        if (str.length()>0){
            if (str.length()<3) {
            return str+str+str;
            } else {
            return sub+sub+sub;
            }
        }
        return str;
    }
    //backAround
    public String backAround (String str){
        if (str.length()>0){
        String lastChar = str.substring(str.length()-1,str.length());
        return lastChar + str + lastChar;
        }
    }

    //0r35 to check
    public boolean or35 (int n){
        return  (n>0) ? n%3==0 || n%5==0 : false;
    }

    //front22
    public String front22 (String str) {
        String sub=str.substring(0,2);
        if (str.length()>0){
            if (str.length()>=2){
            return sub + str + sub;
            }
            return  str+ str+str;
        }
        return str;
    }

    //startHi
    public boolean startHi (String str){
        if (str.length()>0) {
            return str.startsWith("hi");
        }
        return false;
    }

    //icyHot
    public boolean icyHot (int temp1, int temp2) {
        return (temp1<0 && temp2>100) || (temp1>100 && temp2<0);
    }

    //in1020
    public  boolean in1020 (int a, int b) {
        return a>=10 && a<=20 || b>=10 && b<=20;
    }

    //hasTeen
    public boolean hasTeen (int a, int b, int c) {
        return  a>=13 && a<=19 ||
                b>=13 && b<=19 ||
                c>=13 && c<=19;
    }

    //delDel
    public String delDel (String str){
        if (str.length()>0){
            if (str.length()>=4 && str.substring(1,4).equals("del")) {
            return str.substring(0,1)+str.substring(4,str.length());
            }
            return str;
        }
        return str;
    }

    //max1020 (not working properly)
    public int max1020 (int a, int b) {
        int max = Math.max(a,b);
        return  (max>=10 && max <=20)? max: 0;
    }

    //stringE
    public boolean stringE (String str) {
        int count=0;
        if (str.length>0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'e')
                    count++;
            }
            return (count >= 1 && count <= 3);
        }
        return false;
    }

    //lastDigit
    public boolean lastDigit (int a, int b) {
        return a%10==b%10;
    }

    //endUp
    public String endUp (String str) {
        if (str.length() > 0) {
            if (str.length() <= 3) {
                return str.toUpperCase();
            }
            String front = str.substring(0, str.length() - 3);
            String back = str.substring(str.length() - 3).toUpperCase();
            return front + back;
        }
        return str;
    }

    //enveryNth
    public String everyNth (String str, int n) {
        String result = "";
        for (int i=0; i<str.length(); i=i+n){
            result = result + str.charAt(i);
        }
        return result;
    }

}