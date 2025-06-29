package GARDEN;
public abstract class Garden {
    protected String name;
    protected double sizeInSquareMeters;
    protected boolean isPublic;

    public Garden(String name, double sizeInSquareMeters, boolean isPublic) {
        this.name = name;
        this.sizeInSquareMeters = sizeInSquareMeters;
        this.isPublic = isPublic;
    }

    public abstract String getGardenType();
    public abstract String getUniqueFeature();

    public String getSummary() {
        return String.format("Garden Name: %s\nType: %s\nSize: %.2f sqm\nPublic Access: %s\nFeature: %s",
        name, getGardenType(), sizeInSquareMeters, isPublic ? "Yes" : "No", getUniqueFeature());
    }

    public String getDetails() {
        return getSummary();
    }
}