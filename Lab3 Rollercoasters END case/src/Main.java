import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while ( scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if ( line.isEmpty()) continue;

            if ( line.equals("END")) {
                break;
            }

            // split semicolon
            String[] parts = line.split(";");

            if ( parts.length != 4) continue;

            // parse field
            String name = parts[0];
            String world = parts[1];
            int height = Integer.parseInt(parts[2]);
            int time = Integer.parseInt(parts[3]);

            // create Object
            Rollercoaster rollercoaster = new Rollercoaster(name, world, height, time);

            System.out.println(rollercoaster.format());
        }
        System.out.println("END");
        scanner.close();
    }
}
