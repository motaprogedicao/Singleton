public class Main {

    public static void main(String[] args) {

        GPS gps1 = GPS.getInstance();
        gps1.setLatitude(10f);
        gps1.setLongitude(22f);
        System.out.println("Latitude: " + gps1.getLatitude());
        System.out.println("Longitude " + gps1.getLongitude());

        GPS gps2 = GPS.getInstance();
        System.out.println("Latitude: " + gps1.getLatitude());
        System.out.println("Longitude " + gps1.getLongitude());
    }
}
