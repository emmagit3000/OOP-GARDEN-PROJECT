package GARDEN;
public class VerticalGarden extends Garden {
  private int wallCount;

  public VerticalGarden(String name, double size, boolean isPublic, int wallCount) {
    super(name, size, isPublic);
    this.wallCount = wallCount;
  }

  @Override
  public String getGardenType() {
    return "Vertical Garden";
  }

  @Override
  public String getUniqueFeature() {
    return "Uses " + wallCount + " vertical wall panels";
  }
}
