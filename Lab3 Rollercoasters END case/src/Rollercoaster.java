public class Rollercoaster {
     private String name;
     private String world;
     private int height;
     private int time;

     Rollercoaster(String name, String world, int height, int time) {
         this.name = name;
         this.world = world;
         this.height = height;
         this.time = time;
     }

     public String format(){
         return name + "(" + world + "): " + time;
     }

}
