package analyse;


import analyse.support;
import static java.lang.System.currentTimeMillis;
import analyse.solutions.efficacite29;
import analyse.solutions.efficacite135;
import analyse.solutions.sobriete67;


public class testAnalyse {

    /**
     * Affiche les temps d'exécutions des programmes en fonction de plusieurs tailles de chaînes de caractères.
     * Affiche les ressources mémoires utilisées pour le programme 'sobriete67'.
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        testEfficacite29();
        testEfficacite135();
        testSobriete67();
    }


    public static void testEfficacite29() {
        System.out.println("\n\n===== TEST DU PROGRAMME efficacite29 =====");

        //Initialisation
        double time = System.nanoTime()/Math.pow(10, 6);
        efficacite29.erase(support.random_spaced_string(1));

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

        System.out.println("\nChaîne de taille 10000");
        time = System.nanoTime()/Math.pow(10, 6);
        efficacite29.erase(support.random_spaced_string(10000));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);
    }


    public static void testEfficacite135() {
        System.out.println("\n\n===== TEST DU PROGRAMME efficacite135 =====");

        //Initialisation
        double time = System.nanoTime()/Math.pow(10, 6);
        efficacite135.erase(support.random_spaced_string(1));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 1");
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

        System.out.println("\nChaîne de taille 10000");
        time = System.nanoTime()/Math.pow(10, 6);
        efficacite135.erase(support.random_spaced_string(10000));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);
    }


    public static void testSobriete67() {
        System.out.println("\n\n===== TEST DU PROGRAMME sobriete67 (temps) =====");

        //Initialisation
        double time = System.nanoTime()/Math.pow(10, 6);
        sobriete67.erase(support.random_spaced_string(1));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 1");
        time = System.nanoTime()/Math.pow(10, 6);
        sobriete67.erase(support.random_spaced_string(1));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 10");
        time = System.nanoTime()/Math.pow(10, 6);
        sobriete67.erase(support.random_spaced_string(10));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 100");
        time = System.nanoTime()/Math.pow(10, 6);
        sobriete67.erase(support.random_spaced_string(100));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 1000");
        time = System.nanoTime()/Math.pow(10, 6);
        sobriete67.erase(support.random_spaced_string(1000));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        System.out.println("\nChaîne de taille 10000");
        time = System.nanoTime()/Math.pow(10, 6);
        sobriete67.erase(support.random_spaced_string(10000));
        System.out.println((System.nanoTime()/Math.pow(10, 6))-time);

        testSobriete67B();
    }

    public static void testSobriete67B() {
        System.out.println("\n\n===== TEST DU PROGRAMME sobriete67 (mémoire) =====");

        //Initialisation
        double memoryB = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        sobriete67.erase(support.random_spaced_string(1000));
        double memoryA = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println((memoryA / Math.pow(10, 6)) - (memoryB / Math.pow(10, 6)));

        System.out.println("\nChaîne de taille 1000");
        memoryB = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        sobriete67.erase(support.random_spaced_string(1000));
        memoryA = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println((memoryA / Math.pow(10, 6)) - (memoryB / Math.pow(10, 6)));

        System.out.println("\nChaîne de taille 10000");
        memoryB = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        sobriete67.erase(support.random_spaced_string(10000));
        memoryA = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println((memoryA / Math.pow(10, 6)) - (memoryB / Math.pow(10, 6)));

        System.out.println("\nChaîne de taille 50000");
        memoryB = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        sobriete67.erase(support.random_spaced_string(50000));
        memoryA = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println((memoryA / Math.pow(10, 6)) - (memoryB / Math.pow(10, 6)));

        System.out.println("\nChaîne de taille 100000");
        memoryB = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        sobriete67.erase(support.random_spaced_string(100000));
        memoryA = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println((memoryA / Math.pow(10, 6)) - (memoryB / Math.pow(10, 6)));
    }

}
