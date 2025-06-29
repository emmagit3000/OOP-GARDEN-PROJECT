package GARDEN;
public class DesertGarden extends Garden {
  private int cactusCount;

  public DesertGarden(String name, double size, boolean isPublic, int cactusCount) {
    super(name, size, isPublic);
    this.cactusCount = cactusCount;
  }

  @Override
  public String getGardenType() {
    return "Desert Garden";
  }

  @Override
  public String getUniqueFeature() {
    return "Home to " + cactusCount + " cacti";
  }
}