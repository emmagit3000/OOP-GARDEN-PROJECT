package GARDEN;
public class IndoorGarden extends Garden {
  private boolean hasArtificialLighting;

  public IndoorGarden(String name, double size, boolean isPublic, boolean hasArtificialLighting) {
    super(name, size, isPublic);
    this.hasArtificialLighting = hasArtificialLighting;
  }

  @Override
  public String getGardenType() {
    return "Indoor Garden";
  }

  @Override
  public String getUniqueFeature() {
    return hasArtificialLighting ? "Has artificial lighting setup" : "Relies on natural light";
  }
}