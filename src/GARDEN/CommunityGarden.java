package GARDEN;
public class CommunityGarden extends Garden {
  private int contributorCount;

  public CommunityGarden(String name, double size, boolean isPublic, int contributorCount) {
    super(name, size, isPublic);
    this.contributorCount = contributorCount;
  }

  @Override
  public String getGardenType() {
    return "Community Garden";
  }

  @Override
  public String getUniqueFeature() {
    return "Maintained by " + contributorCount + " community members";
  }
}