package GARDEN;
public class HerbalGarden extends Garden {
  private boolean includesMedicinalPlants;

  public HerbalGarden(String name, double size, boolean isPublic, boolean includesMedicinalPlants) {
    super(name, size, isPublic);
    this.includesMedicinalPlants = includesMedicinalPlants;
  }

  @Override
  public String getGardenType() {
    return "Herbal Garden";
  }

  @Override
  public String getUniqueFeature() {
    return includesMedicinalPlants ? "Includes medicinal herbs" : "Basic herbal variety";
  }
}