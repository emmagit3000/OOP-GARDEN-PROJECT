// GardenHierarchyTest.java

package GARDEN;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Verifies the abstract Garden contract plus five concrete subclasses.
 */
class GardenHierarchyTest {

    @Test
    void parentSummaryContainsAllCoreFields() {
        Garden g = new ZenGarden("Peaceful Zen", 100, false, true);
        String summary = g.getSummary();

        assertAll("summary",
            () -> assertTrue(summary.contains("Peaceful Zen")),
            () -> assertTrue(summary.contains("Zen Garden")),
            () -> assertTrue(summary.contains("100.00")),
            () -> assertTrue(summary.toLowerCase().contains("no"))
        );
    }

    @Test
    void zenGardenUniqueFeatureIsReflected() {
        ZenGarden z = new ZenGarden("Calm Rock", 80, true, true);
        assertEquals("Includes sand and rock patterns", z.getUniqueFeature());
    }

    @Test
    void botanicalGardenStoresPlantCollection() {
        BotanicalGarden b = new BotanicalGarden("Tropics", 600, true, "Orchids");
        assertEquals("Orchids", b.getUniqueFeature());
    }

    @Test
    void desertGardenHeatIndexWorks() {
        DesertGarden d = new DesertGarden("Dry Oasis", 500, false, 45);
        assertTrue(d.getUniqueFeature().contains("45"));
    }

    @Test
    void tropicalGardenShowsWaterfallPresence() {
        TropicalGarden t = new TropicalGarden("Rainforest", 900, true, true);
        assertTrue(t.getUniqueFeature().toLowerCase().contains("waterfall"));
    }

    @Test
    void rockGardenListsRockTypes() {
        RockGarden r = new RockGarden("Stone Serenity", 150, true, 3);
        assertEquals("Uses 3 types of rocks", r.getUniqueFeature());
    }
}


// GardenExplorerTest.java
// package GARDEN;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

/**
 * Lightweight integration tests for the search engine—
 * simulates how the Main program will use it.
 */
class GardenExplorerTest {

    private GardenSearchEngine buildEngine() {
        GardenSearchEngine e = new GardenSearchEngine();
        e.addGarden(new ZenGarden("Peaceful Zen", 120, false, true));
        e.addGarden(new BotanicalGarden("Tropical Wonders", 800, true, "Orchids"));
        e.addGarden(new DesertGarden("Dry Oasis", 500, true, 42));
        return e;
    }

    @Test
    void findGardenByTypeReturnsSummary() {
        String result = buildEngine().findGardenByType("Zen Garden");
        assertTrue(result.contains("Zen Garden"));
    }

    @Test
    void findGardenByTypeHandlesUnknownGracefully() {
        String result = buildEngine().findGardenByType("Martian Garden");
        assertTrue(result.startsWith("❌"));
    }

    @Test
    void searchByNameReturnsCorrectGarden() {
        String result = buildEngine().searchAttribute("Dry Oasis");
        assertTrue(result.contains("Dry Oasis"));
    }

    @Test
    void searchByNameHandlesMissingName() {
        String result = buildEngine().searchAttribute("Non‑Existing");
        assertTrue(result.startsWith("⚠️"));
    }
}
