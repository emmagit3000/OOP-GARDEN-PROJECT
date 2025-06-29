package GARDEN;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GardenExplorer {
    private static Map<String, Garden> gardenMap = new HashMap<>();

    public static void main(String[] args) {
        initializeGardens();

        Scanner scanner = new Scanner(System.in);
        System.out.println("🌿 Welcome to the Garden Explorer! 🌿");

        while (true) {
            System.out.println("\nEnter the name of a garden type to explore it (or type 'list' to see all, 'exit' to quit): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("👋 Exiting Garden Explorer. Goodbye!");
                break;
            }

            if (input.equals("list")) {
                listAllGardens();
                continue;
            }

            if (gardenMap.containsKey(input)) {
                Garden garden = gardenMap.get(input);
                System.out.println("\n🪴 GARDEN DETAILS:");
                System.out.println(garden.getDetails());
            } else {
                System.out.println("❌ Oops! We couldn't find that garden type. Please try again or type 'list'.");
            }
        }

        scanner.close();
    }

    private static void initializeGardens() {
        // Add all your garden objects here
        gardenMap.put("aquatic", new AquaticGarden("The Great Barrier Garden", 500.0, true, true));
        gardenMap.put("botanical", new BotanicalGarden("Royal Botanic Gardens, Kew", 300.0, true, "Orchids and Tropical Plants"));
        gardenMap.put("butterfly", new ButterflyGarden("Monarch Haven", 50.0, true, 25));
        gardenMap.put("community", new CommunityGarden("Urban Oasis Community Garden", 75.0, true, 45));
        gardenMap.put("desert", new DesertGarden("Sonoran Cactus", 250.0, true, 150));
        gardenMap.put("formal", new FormalGarden("Versailles Gardens", 800.0, true, true));
        gardenMap.put("herbal", new HerbalGarden("Healing Herb Haven", 60.0, true, true));
        gardenMap.put("indoor", new IndoorGarden("Urban Balcony Greenhouse", 20.0, false, true));
        gardenMap.put("kitchen", new KitchenGarden("Chef's Herb", 30.0, false, 12));
        gardenMap.put("rock", new RockGarden("Alpine Rockery", 80.0, true, 50));
        gardenMap.put("rain", new RainGarden("Stormwater Oasis", 150.0, true, true));
        gardenMap.put("rooftop", new RooftopGarden("Skyline Rooftop Oasis", 180.0, true, 10));
        gardenMap.put("sculpture", new SculptureGarden("Artistic Retreat Sculpture Park", 400.0, true, 30));
        gardenMap.put("terrace", new TerraceGarden("Sky-High Terrace", 100.0, false, true));
        gardenMap.put("terrarium", new TerrariumGarden("Miniature Rainforest", 5.0, false, true));
        gardenMap.put("tropical", new TropicalGarden("Amazonian Paradise", 600.0, true, true));
        gardenMap.put("vertical", new VerticalGarden("Green Wall Eco-System", 70.0, true, 5));
        gardenMap.put("wildlife", new WildlifeGarden("Nature's Sanctuary", 200.0, true, true));
        gardenMap.put("zen", new ZenGarden("Serenity Zen Garden", 90.0, true, true));
    }

    private static void listAllGardens() {
        System.out.println("\n🌱 Available Garden Types:");
        for (String name : gardenMap.keySet()) {
            System.out.println(" - " + capitalize(name) + " Garden");
        }
    }

    private static String capitalize(String word) {
        if (word == null || word.length() == 0) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
