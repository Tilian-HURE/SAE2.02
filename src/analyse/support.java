package analyse;


import java.util.Random;


public class support {

    /**
     * Generates random sized string with randomly placed spaces
     * @param size : size of the string
     * @return generated string
     * @throws NumberFormatException si size <= 0 ou si size n'est pas un entier
     */
    public static String random_spaced_string(int size) throws NumberFormatException {
        if (size <= 0) {
            throw new NumberFormatException("La taille donnée doit être > 0 !");
        }
        StringBuilder string = new StringBuilder();
        Random randomizer = new Random();
        int randomInt;
        for (int i=0; i<size; i++) {
            randomInt = randomizer.nextInt(1, 3);
            if (randomInt == 1) {
                string.append((char)randomizer.nextInt(65, 123));
            } else {
                string.append(" ");
            }
        }
        return string.toString();
    }

}
