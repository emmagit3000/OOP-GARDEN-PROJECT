package GARDEN;
public class TerrariumGarden extends Garden {
  private boolean sealedContainer;

  public TerrariumGarden(String name, double size, boolean isPublic, boolean sealedContainer) {
    super(name, size, isPublic);
    this.sealedContainer = sealedContainer;
  }

  @Override
  public String getGardenType() {
    return "Terrarium Garden";
  }

  @Override
  public String getUniqueFeature() {
    return sealedContainer ? "Sealed terrarium environment" : "Open terrarium layout";
  }
}