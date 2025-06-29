package GARDEN;
public class RainGarden extends Garden {
  private boolean designedForDrainage;

  public RainGarden(String name, double size, boolean isPublic, boolean designedForDrainage) {
    super(name, size, isPublic);
    this.designedForDrainage = designedForDrainage;
  }

  @Override
  public String getGardenType() {
    return "Rain Garden";
  }

  @Override
  public String getUniqueFeature() {
    return designedForDrainage ? "Absorbs rain runoff efficiently" : "Decorative water control";
  }
}