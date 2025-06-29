package GARDEN;
public class RockGarden extends Garden {
  private int rockTypes;

  public RockGarden(String name, double size, boolean isPublic, int rockTypes) {
    super(name, size, isPublic);
    this.rockTypes = rockTypes;
  }

  @Override
  public String getGardenType() {
    return "Rock Garden";
  }

  @Override
  public String getUniqueFeature() {
    return "Uses " + rockTypes + " types of rocks";
  }
}