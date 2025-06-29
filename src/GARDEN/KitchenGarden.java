package GARDEN;
public class KitchenGarden extends Garden {
  private int vegetableTypes;

  public KitchenGarden(String name, double size, boolean isPublic, int vegetableTypes) {
    super(name, size, isPublic);
    this.vegetableTypes = vegetableTypes;
  }

  @Override
  public String getGardenType() {
    return "Kitchen Garden";
  }

  @Override
  public String getUniqueFeature() {
    return "Grows " + vegetableTypes + " types of vegetables";
  }
}