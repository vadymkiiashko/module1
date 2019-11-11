package module;

public class chechIfStringIsValid {


    public boolean isValid(String line) {
        int numsOfOpenPr = 0;
        int numsOfOpenCurly = 0;
        int numsOfOpenBraces = 0;
        int numsOfOpenPrRev = 0;
        int numsOfOpenCurlyRev = 0;
        int numsOfOpenBracesRev = 0;
        if (line.length() == 0) return false;
        for (int i = 0; i < line.length() - 1; i++) {

            if (line.charAt(i) == '(') ++numsOfOpenPr;
            if (line.charAt(i) == '{') ++numsOfOpenCurly;
            if (line.charAt(i) == '[') ++numsOfOpenBraces;
            if (line.charAt(i) == ')') ++numsOfOpenPrRev;
            if (line.charAt(i) == '}') ++numsOfOpenCurlyRev;
            if (line.charAt(i) == ']') ++numsOfOpenBracesRev;

        }
        if ((numsOfOpenBraces == numsOfOpenBracesRev)
                && (numsOfOpenCurly == numsOfOpenCurlyRev)
                && (numsOfOpenPr == numsOfOpenPrRev)) {
            return true;
        } else return false;


    }
}