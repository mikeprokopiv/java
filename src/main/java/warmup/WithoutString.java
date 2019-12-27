package warmup;

public class WithoutString {
    // Tricky solution ! Can be solved via Loop as well.
    public String withoutString(String base, String remove) {
        if (base==null || remove == null){
            throw new NullPointerException("Base string is null");
        }

        return base.replaceAll("(?i)" + remove, "");
    }
}

