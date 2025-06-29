package GARDEN;
public class FormalGarden extends Garden {
  private boolean symmetricalDesign;

  public FormalGarden(String name, double size, boolean isPublic, boolean symmetricalDesign) {
      super(name, size, isPublic);
      this.symmetricalDesign = symmetricalDesign;
  }

  @Override
  public String getGardenType() {
      return "Formal Garden";
  }

  @Override
  public String getUniqueFeature() {
      return symmetricalDesign ? "Perfectly symmetrical layout" : "Loosely formal";
  }
}