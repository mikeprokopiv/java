package warmup;

public class CountYZ {
    int count = 0;

    public int countYZ(String str) {
        if (str == null) {
            return count;
        }

        String strLowerCase = str.toLowerCase();

        for (int i = 0; i < strLowerCase.length(); i++) {
            if (!Character.isLetter(strLowerCase.charAt(i))) {
                if (i == 0) {
                    if (strLowerCase.charAt(0) == 'y' || strLowerCase.charAt(0) == 'z') {
                        count++;
                    }
                    continue;
                }
                if (strLowerCase.charAt(i - 1) == 'y' || strLowerCase.charAt(i - 1) == 'z') {
                    count++;
                }
            }
        }

        if (strLowerCase.charAt(strLowerCase.length() - 1) == 'y' || strLowerCase.charAt(strLowerCase.length() - 1) == 'z') {
            count++;
        }
        return count;
    }
}