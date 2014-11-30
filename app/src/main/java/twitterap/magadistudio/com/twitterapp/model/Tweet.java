package twitterap.magadistudio.com.twitterapp.model;

/**
 * Created by paulodichone on 11/29/14.
 *
 * Tweet class represents a single tweet which contains:
 *  - Id
 *  - timeStamp
 *  - location
 *  - lat
 *  - long
 *  - description (the actual tweet)
 */


public class Tweet {
    private String Id;
    private String timeStamp;
    private String description;
    private String location;
    private long lat;
    private long lon;

    public  Tweet(){

    }

    public Tweet(String id, String timeStamp, String description, String location, long lat, long lon){
        this.Id = id;
        this.timeStamp = timeStamp;
        this.description = description;
        this.location = location;
        this.lat = lat;
        this.lon = lon;


    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getLat() {
        return lat;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }

    public long getLon() {
        return lon;
    }

    public void setLon(long lon) {
        this.lon = lon;
    }
}
