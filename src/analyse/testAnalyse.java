package analyse;


import analyse.support;
import static java.lang.System.currentTimeMillis;
import analyse.solutions.efficacite29;
import analyse.solutions.efficacite135;


public class testAnalyse {

    public static void main(String[] args) throws ClassNotFoundException {
        testEfficacite29();
        testEfficacite135();
    }


    public static void testEfficacite29() {
        System.out.println("\n\n===== TEST DU PROGRAMME efficacite29 =====");
        double time = System.nanoTime()/Math.pow(10, 6);

        System.out.println("Chaîne de taille 1");
        time = System.nanoTime()/Math.pow(10, 6);
        efficacite29.erase(support.random_spaced_string(1));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 10");
        time = System.nanoTime()/Math.pow(10, 6);
        efficacite29.erase(support.random_spaced_string(10));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 100");
        time = System.nanoTime()/Math.pow(10, 6);
        efficacite29.erase(support.random_spaced_string(100));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 1000");
        time = System.nanoTime()/Math.pow(10, 6);
        efficacite29.erase(support.random_spaced_string(1000));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);
    }


    public static void testEfficacite135() {
        System.out.println("\n\n===== TEST DU PROGRAMME efficacite135 =====");
        double time = System.nanoTime()/Math.pow(10, 6);

        System.out.println("Chaîne de taille 1");
        time = System.nanoTime()/Math.pow(10, 6);
        efficacite135.erase(support.random_spaced_string(1));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 10");
        time = System.nanoTime()/Math.pow(10, 6);
        efficacite135.erase(support.random_spaced_string(10));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 100");
        time = System.nanoTime()/Math.pow(10, 6);
        efficacite135.erase(support.random_spaced_string(100));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 1000");
        time = System.nanoTime()/Math.pow(10, 6);
        efficacite135.erase(support.random_spaced_string(1000));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);
    }

}
