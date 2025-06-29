package GARDEN;
public class TerraceGarden extends Garden {
  private boolean rainwaterHarvesting;

  public TerraceGarden(String name, double size, boolean isPublic, boolean rainwaterHarvesting) {
    super(name, size, isPublic);
    this.rainwaterHarvesting = rainwaterHarvesting;
  }

  @Override
  public String getGardenType() {
    return "Terrace Garden";
  }

  @Override
  public String getUniqueFeature() {
    return rainwaterHarvesting ? "Uses rainwater harvesting" : "Standard terrace setup";
  }
}