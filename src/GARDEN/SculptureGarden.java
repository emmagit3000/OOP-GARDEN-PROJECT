package GARDEN;
public class SculptureGarden extends Garden {
  private int sculptureCount;

  public SculptureGarden(String name, double size, boolean isPublic, int sculptureCount) {
    super(name, size, isPublic);
    this.sculptureCount = sculptureCount;
  }

  @Override
  public String getGardenType() {
    return "Sculpture Garden";
  }

  @Override
  public String getUniqueFeature() {
    return "Contains " + sculptureCount + " artistic sculptures";
  }
}