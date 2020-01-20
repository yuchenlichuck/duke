package seedu.duke;
import java.util.Scanner;
/**
 * Entry point.
 */
public class Duke {
    /**
     * Start here.
     */
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);



        Scanner in = new Scanner(System.in);
        System.out.println("Hello! I'm Duke\nWhat can I do for you?");

        String string = in.nextLine();
        
        while (!string.equals("bye")) {
            System.out.println(string);
            string = in.nextLine();
        }
        System.out.println("Bye. Hope to see you again soon!");
        in.close();
    }
}
