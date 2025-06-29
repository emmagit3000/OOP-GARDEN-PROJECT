package GARDEN;
public class BotanicalGarden extends Garden {
  private String plantCollection;

  public BotanicalGarden(String name, double size, boolean isPublic, String plantCollection) {
    super(name, size, isPublic);
    this.plantCollection = plantCollection;
  }

  @Override
  public String getGardenType() {
    return "Botanical Garden";
  }

  @Override
  public String getUniqueFeature() {
    return plantCollection;
  }
}