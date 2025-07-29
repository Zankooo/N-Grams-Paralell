
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static ConcurrentHashMap<String, AtomicInteger> nGrams = new ConcurrentHashMap<>();

    public static String izbiraTeksta() {
        String[] datoteke = {"123MB.txt", "234MB.txt", "350MB.txt", "490MB.txt", "613MB.txt"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Izberi besedilo:");
        for (int i = 0; i < datoteke.length; i++) {
            System.out.println((i+1) + ". " + datoteke[i]);
        }
        while (true) {
            System.out.print("Vaša izbira (1-" + datoteke.length + "): ");
            if (scanner.hasNextInt()) {
                int izbira = scanner.nextInt();
                if (izbira >= 1 && izbira <= datoteke.length) {
                    return "resources/" + datoteke[izbira-1];
                }
            } else {
                scanner.next();
            }
            System.out.println("Neveljavna izbira. Prosimo, vnesite številko med 1 in " + datoteke.length + ".");
        }
    }

    public static void main(String[] args) {
    }
    }