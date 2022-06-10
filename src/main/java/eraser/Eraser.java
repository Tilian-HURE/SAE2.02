package eraser;


import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * @author Tilian HURÉ
 */
public class Eraser {

    /**
     * Removes only single spaces from given string.
     * @param text : string to edit
     * @return edited string
     */
    public static String erase(String text) {
        StringBuilder listedText = new StringBuilder(text);
        int textSize = listedText.length();
        char chara = '/';
        for (int i=0; i<textSize; i++) {
            chara = listedText.charAt(i);
            if ((chara == ' ' && textSize == 1) || (chara == ' '
              && listedText.charAt(max(i-1, ((textSize>1)?1:0))) != ' '
              && listedText.charAt(min(i+1, textSize-((textSize>1)?1:0)*2)) != ' ')) {
                listedText.deleteCharAt(i);
                textSize--;
            }
        }
        return listedText.toString();
    }

}