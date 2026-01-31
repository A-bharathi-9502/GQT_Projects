package Quiz_Application;
import java.util.Random;
public class LifeLines {
    public static boolean audienceUsed = false;
    public static boolean fiftyUsed = false;
    public static void audiencePoll(char correctOption) {
        System.out.println("\n=========" + Colors.GREEN + " AUDIENCE POLL " + Colors.RESET + "=========\n");
        int correctPercent = 70;
        int remaining = 30;
        int eachWrong = remaining / 3;
        for (char opt = 'a'; opt <= 'd'; opt++) {
            if (opt == correctOption) {
                System.out.print(opt + " -> " + correctPercent + "%   ");
            } else {
                System.out.print(opt + " -> " + eachWrong + "%   ");
            }
        }
        System.out.println("\n=========================================\n");
        audienceUsed = true;
    }
    public static void fiftyFifty(String[] options, char correctOption) {
        System.out.println(
            Colors.GREEN + "========= FIFTY FIFTY ACTIVATED =========" + Colors.RESET);
        int[] wrongIndexes = new int[3];
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (options[i].charAt(0) != correctOption) {
                wrongIndexes[count++] = i;
                }
        }
        Random r = new Random();
        int first = r.nextInt(3);
        int second;
        do {
            second = r.nextInt(3);
        } while (second == first);
        options[wrongIndexes[first]] = "";
        options[wrongIndexes[second]] = "";
        fiftyUsed = true;
    }
}
