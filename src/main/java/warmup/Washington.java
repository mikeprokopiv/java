package warmup;

class Washington {
    int count;

    int stringMatch(String a, String b) {
        if (a == null || b == null) {
            throw new NullPointerException("String can not be null") ;
        }
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }
        return count;
    }
}