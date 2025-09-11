import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        // Simple Hello World
        System.out.println("Hello World!");

        // Using Scanner
        Scanner scanner = new Scanner(System.in);

        // for loop
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // if-else
        if (args.length < 6)
        {
            System.out.printf("Number of CMD Args: %s\n", args.length);
        }
        else {
            System.out.println("too little\n");
        }

        // switch
        String words = args[1];

        switch ( words ){
            case "Start":
                System.out.println("System Start");
                break;
            case "Stop":
                System.out.println("System Stop");
                break;
            case "Resume":
                System.out.println("System Resume");
                break;
            default:
                System.out.println("System Quit");
                break;
        }
        String results;
        // New Syntax
        switch (words) {
            case "Stop", "Quit" -> results = "End";
            case "Start", "Resume" -> results = "Begin";
            default -> results = "Nothing";
        }

        System.out.println(results);
    }
}
