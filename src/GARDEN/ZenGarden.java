package GARDEN;
public class ZenGarden extends Garden {

  private boolean hasSandPatterns;

  public ZenGarden(String name, double size, boolean isPublic, boolean hasSandPatterns) {
    super(name, size, isPublic);
    this.hasSandPatterns = hasSandPatterns;
  }

  @Override
  public String getGardenType() {
    return "Zen Garden";
  }

  @Override
  public String getUniqueFeature() {
    return hasSandPatterns ? "Includes sand and rock patterns" : "Minimal Zen layout";
  }
}
