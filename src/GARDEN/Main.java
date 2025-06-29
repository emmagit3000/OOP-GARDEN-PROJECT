package GARDEN;

public class Main {
  
  private static int passed = 0;
  private static int failed = 0;

  private static void test(String label, boolean condition){

    if (condition){
      System.out.println("✅  " + label);
      passed++;
    } else {
      System.out.println("❌  " + label);
      failed++;
    }
  }

  public static void main(String[] args) {

    // 1️⃣  build a miniature fixture
    GardenSearchEngine engine = new GardenSearchEngine();
    Garden zen     = new ZenGarden("Peaceful Zen", 120.0, false, true);
    Garden botanic = new BotanicalGarden("Tropical Wonders", 800.0, true, "Rare orchids");
    Garden herbal  = new HerbalGarden("Healing Herbs", 150.0, true, true);
  
    engine.addGarden(zen);
    engine.addGarden(botanic);
    engine.addGarden(herbal);
  
    /* --- actual tests --- */
  
    // - search by TYPE
    String zenResult = engine.findGardenByType("Zen Garden");
    test("Existing type found", zenResult.contains("Zen Garden"));
  
    String badType = engine.findGardenByType("Martian Garden");
    test("Missing type gives friendly error", badType.startsWith("❌"));
  
    // - search by NAME
    String nameHit = engine.searchAttribute("Healing Herbs");
    test("Existing name found", nameHit.contains("Healing Herbs"));
  
    String nameMiss = engine.searchAttribute("Unknown Name");
    test("Missing name gives warning", nameMiss.startsWith("⚠️"));
  
    // - summary / details consistency
    test("getDetails() mirrors getSummary()",
    herbal.getDetails().equals(herbal.getSummary()));
  
    // -------
  
    System.out.printf("%nTests passed: %d | failed: %d%n", passed, failed);
    if (failed > 0) {
      System.exit(1);      // non‑zero exit signals failure to graders/CI
    }
  }  
}