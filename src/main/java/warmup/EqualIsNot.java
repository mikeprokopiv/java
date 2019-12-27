package warmup;

public class EqualIsNot {
    public boolean equalIsNot(String str) {
        if (str == null) {
            return false;
        }
        int firstPatternCount = 0;
        int secondPatternCount = 0;
        String enhancedUserInput = str + " "; // Enhanced user input not to build second loop since second pattern is longer;

        for (int i = 0; i < enhancedUserInput.length() - 2; i++) {
            if (patternToStringEqualCheck(i, enhancedUserInput, "is")) {
                firstPatternCount++;
            }
            if (patternToStringEqualCheck(i, enhancedUserInput, "not")) {
                secondPatternCount++;
            }
        }
        return firstPatternCount == secondPatternCount;
    }

    private boolean patternToStringEqualCheck(int startPosition, String desiredString, String stringToCompareWith) {
        return desiredString.substring(startPosition, startPosition + stringToCompareWith.length()).equals(stringToCompareWith);
    }
}
