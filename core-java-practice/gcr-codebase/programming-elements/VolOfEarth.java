public class VolOfEarth {
    public static void main(String[] args) {
        double radius = 6378.0; // in kilometers
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double cubicMiles = volume * 0.239912; // converting cubic kilometers to cubic miles
        System.out.println("The volume of the Earth is approximately: " + volume + " cubic kilometers and cubic miles is " + cubicMiles);
    }
}
