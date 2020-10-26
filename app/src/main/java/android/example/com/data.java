package android.example.com;

public class data {
    private String dataTitle;
    private int dataImageResourceId;
    private String visitLocation;

    public data(String title, int imageResourceId, String location) {
        dataTitle = title;
        dataImageResourceId = imageResourceId;
        visitLocation = location;
    }

    public String getTitle() {

        return dataTitle;
    }

    public int getImageResourceId() {

        return dataImageResourceId;
    }

    public String getLocation() {

        return visitLocation;
    }
}
