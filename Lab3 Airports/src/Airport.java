public class Airport {

    private String name;
    private String city;
    private int runways;
    private int time;

    Airport(String name, String city, int runways, int time) {
        this.name = name;
        this.city = city;
        this.runways = runways;
        this.time = time;
    }

    // method to format output
    public String format() {
        return name + " (" + city + "): " + time;
    }
}
