package GARDEN;
public class RooftopGarden extends Garden {
  private int floorLevel;

  public RooftopGarden(String name, double size, boolean isPublic, int floorLevel) {
    super(name, size, isPublic);
    this.floorLevel = floorLevel;
  }

  @Override
  public String getGardenType() {
    return "Rooftop Garden";
  }

  @Override
  public String getUniqueFeature() {
    return "Located on floor " + floorLevel;
  }
}