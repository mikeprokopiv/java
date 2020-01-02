package warmup;

public class CountYZ {

    public int countYZ(String str) {
        int count = 0;
        if (str == null) {
            return count;
        }

        String strLowerCase = str.toLowerCase();
        strLowerCase = " " + strLowerCase + " ";

        for (int i = 0; i < strLowerCase.length(); i++) {
            if (!Character.isLetter(strLowerCase.charAt(i))) {
                if (isYorZ(strLowerCase, i - 1)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isYorZ(String str, int pos) {
        return str.charAt(pos) == 'y' || str.charAt(pos) == 'z';
    }
}

