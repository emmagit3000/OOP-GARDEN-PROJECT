package GARDEN;
public class WildlifeGarden extends Garden {
  private boolean hasBirdFeeders;

  public WildlifeGarden(String name, double size, boolean isPublic, boolean hasBirdFeeders) {
    super(name, size, isPublic);
    this.hasBirdFeeders = hasBirdFeeders;
  }

  @Override
  public String getGardenType() {
    return "Wildlife Garden";
  }

  @Override
  public String getUniqueFeature() {
    return hasBirdFeeders ? "Attracts birds and insects" : "Encourages wild flora only";
  }
}