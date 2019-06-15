public class Pack {
    String location;
    int distance;
    int value;
    String date;

    public Pack(String location, int distance, int value, String date) {
        this.location = location;
        this.distance = distance;
        this.value = value;
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public int getDistance() {
        return distance;
    }

    public int getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }
}
