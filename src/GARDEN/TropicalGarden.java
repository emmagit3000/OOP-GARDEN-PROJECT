package GARDEN;
public class TropicalGarden extends Garden {
  private boolean hasWaterfall;

  public TropicalGarden(String name, double size, boolean isPublic, boolean hasWaterfall) {
    super(name, size, isPublic);
    this.hasWaterfall = hasWaterfall;
  }

  @Override
  public String getGardenType() {
    return "Tropical Garden";
  }

  @Override
  public String getUniqueFeature() {
    return hasWaterfall ? "Features a waterfall" : "Lush tropical setup";
  }
}