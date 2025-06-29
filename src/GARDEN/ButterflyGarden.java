package GARDEN;
public class ButterflyGarden extends Garden {
  private int flowerSpecies;

  public ButterflyGarden(String name, double size, boolean isPublic, int flowerSpecies) {
    super(name, size, isPublic);
    this.flowerSpecies = flowerSpecies;
  }

  @Override
  public String getGardenType() {
    return "Butterfly Garden";
  }

  @Override
  public String getUniqueFeature() {
    return "Attracts butterflies with " + flowerSpecies + " flower species";
  }
}