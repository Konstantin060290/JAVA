package ITMO.ITMO;

public class T4_5 {

    public String reverseStringWithCharAt(String inputString) {
        int stringLength = inputString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        return result;
    }
}
