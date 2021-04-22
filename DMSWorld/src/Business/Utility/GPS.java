/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utility;

/**
 *
 * @author rtspi
 */
public class GPS { 
    private String name;
    private double longitude;
    private double latitude;   
   
    // create and initialize a point with given name and
    // (latitude, longitude) specified in degrees
    public GPS(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude  = latitude;
        this.longitude = longitude;
    }

    // return distance between this location and that location
    // measured in statute miles
    public double distanceTo(GPS that) {
        double STATUTE_MILES_PER_NAUTICAL_MILE = 1.15077945;
        double lat1 = Math.toRadians(this.latitude);
        double lon1 = Math.toRadians(this.longitude);
        double lat2 = Math.toRadians(that.latitude);
        double lon2 = Math.toRadians(that.longitude);

        // great circle distance in radians, using law of cosines formula
        double angle = Math.acos(Math.sin(lat1) * Math.sin(lat2)
                               + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        // each degree on a great circle of Earth is 60 nautical miles
        double nauticalMiles = 60 * Math.toDegrees(angle);
        double statuteMiles = STATUTE_MILES_PER_NAUTICAL_MILE * nauticalMiles;
        return statuteMiles;
    }

    // return string representation of this point
    public String toString() {
        return name + " (" + latitude + ", " + longitude + ")";
    }


    // test client
    public static void main(String[] args) throws Exception {
        GPS loc1 = new GPS("PRINCETON_NJ", 40.366633, 74.640832);
        GPS loc2 = new GPS("ITHACA_NY",    42.443087, 76.488707);  
        double distance = loc1.distanceTo(loc2);
        System.out.println("%6.3f miles from\n" + distance);
        System.out.println(loc1 + " to " + loc2);
        
        SendEmailUtility.sendMail("rahul.tiwarithebest@gmail.com");
    }
}
