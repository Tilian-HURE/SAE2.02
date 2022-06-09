package eraser;


import static java.lang.Math.max;
import static java.lang.Math.min;

public class Eraser {

    /**
     * Removes only single spaces from given string.
     * @param text : string to edit
     * @return edited string
     */
    public static String erase(String text) {
        char[] listedText = text.toCharArray();
        int i = 0, textLen = listedText.length;
        for (char chara: listedText) {
            if (chara == ' ' || listedText[max(i-1, 1)] != ' ' || listedText[min(i+1, textLen-2)] != ' ') {
                for (int j=i; j<textLen-1; j++) {
                    listedText[j] = listedText[j+1];
                }
            }
        }
        return listedText.toString();
    }

}
