package GARDEN;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GardenTester {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GardenSearchEngine engine = new GardenSearchEngine();

    // Add sample gardens
    engine.addGarden(new ZenGarden("Peaceful Zen", 120.5, false, true));
    engine.addGarden(new BotanicalGarden("Tropical Wonders", 800.0, true, "Rare orchid collection"));
    engine.addGarden(new TropicalGarden("Rainforest Retreat", 950.0, false, true));
    engine.addGarden(new DesertGarden("Dry Oasis", 600.0, true, 45));
    engine.addGarden(new RockGarden("Stone Serenity", 200.0, false, 10));
    engine.addGarden(new RooftopGarden("Sky Greens", 80.0, true, 5));
    // ... Add other garden instances if needed

    System.out.println("🌱 Welcome to the Garden Explorer System 🌱");

    while (true) {
      System.out.println("\nWhat would you like to do?");
      System.out.println("1. Find garden by type");
      System.out.println("2. Search garden by name");
      System.out.println("3. View all gardens");
      System.out.println("4. Exit");

      try {
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
          case 1:
            System.out.print("Enter garden type: ");
            String type = scanner.nextLine();
            System.out.println(engine.findGardenByType(type));
            break;

          case 2:
            System.out.print("Enter garden name: ");
            String name = scanner.nextLine();
            System.out.println(engine.searchAttribute(name));
            break;

          case 3:
            engine.printAllGardens();
            break;

          case 4:
            System.out.println("👋 Exiting Garden Explorer. Goodbye!");
            scanner.close();
            return;

          default:
            System.out.println("❌ Invalid option. Choose between 1 - 4.");
        }

      } catch (InputMismatchException e) {
        System.out.println("⚠️ Invalid input. Please enter numbers only.");
        scanner.nextLine(); // Clear bad input
      }
    }
  }
}
