package jumptojava.chapter6;

import java.util.Scanner;

public class Question2 {

    public String toUpper() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            if ("END".equals(line)) {
                break;
            }
            return line.toUpperCase();
        }
        return "null";
    }

}
