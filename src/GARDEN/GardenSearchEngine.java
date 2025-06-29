package GARDEN;
import java.util.*;

public class GardenSearchEngine {
    private List<Garden> gardens;

    public GardenSearchEngine() {
        gardens = new ArrayList<>();
    }

    public void addGarden(Garden garden) {
        gardens.add(garden);
    }

    public String findGardenByType(String type) {
        for (Garden g : gardens) {
            if (g.getGardenType().equalsIgnoreCase(type)) {
                return g.getSummary();
            }
        }
        return "❌ No garden of type '" + type + "' found.";
    }

    public String searchAttribute(String name) {
        for (Garden g : gardens) {
            if (g.name.equalsIgnoreCase(name)) {
                return g.getSummary();
            }
        }
        return "⚠️ No garden with name '" + name + "' exists in the system.";
    }

    public void printAllGardens() {
        if (gardens.isEmpty()) {
            System.out.println("📭 No gardens available.");
        }
        for (Garden g : gardens) {
            System.out.println("\n-------------------------");
            System.out.println(g.getSummary());
        }
    }
}