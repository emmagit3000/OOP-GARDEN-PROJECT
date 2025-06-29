package GARDEN;
public class AquaticGarden extends Garden {
  private boolean hasFishPonds;

  public AquaticGarden(String name, double size, boolean isPublic, boolean hasFishPonds) {
    super(name, size, isPublic);
    this.hasFishPonds = hasFishPonds;
  }

  @Override
  public String getGardenType() {
    return "Aquatic Garden";
  }

  @Override
  public String getUniqueFeature() {
    return hasFishPonds ? "Contains fish ponds" : "Only water plants";
  }
}