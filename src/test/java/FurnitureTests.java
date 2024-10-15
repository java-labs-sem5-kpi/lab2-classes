import java.util.Arrays;
import java.util.Comparator;
import com.sergosoft.furniturecatalog.Dimensions;
import com.sergosoft.furniturecatalog.Furniture;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FurnitureTests {

    private Furniture[] furnitureArray;

    @Before
    public void setUp() {
        furnitureArray = new Furniture[] {
                new Furniture("Wood", new Dimensions(100, 50, 30), 20.5f, "Brown", "Table"),
                new Furniture("Metal", new Dimensions(60, 40, 20), 15.0f, "Black", "Chair"),
                new Furniture("Plastic", new Dimensions(120, 60, 35), 10.0f, "White", "Cabinet"),
                new Furniture("Wood", new Dimensions(80, 40, 25), 18.5f, "Red", "Desk"),
                new Furniture("Glass", new Dimensions(70, 35, 15), 12.0f, "Transparent", "Coffee Table")
        };
    }

    @Test
    public void testSortFurnitureByNameAndWeight() {
        Arrays.sort(furnitureArray, Comparator.comparing(Furniture::getName)
                .thenComparing(Comparator.comparing(Furniture::getWeight).reversed()));

        assertEquals("Cabinet", furnitureArray[0].getName());
        assertEquals("Chair", furnitureArray[1].getName());
        assertEquals("Coffee Table", furnitureArray[2].getName());
        assertEquals("Desk", furnitureArray[3].getName());
        assertEquals("Table", furnitureArray[4].getName());

        assertEquals(10.0f, furnitureArray[0].getWeight(), 0.01);
        assertEquals(15.0f, furnitureArray[1].getWeight(), 0.01);
        assertEquals(12.0f, furnitureArray[2].getWeight(), 0.01);
        assertEquals(18.5f, furnitureArray[3].getWeight(), 0.01);
        assertEquals(20.5f, furnitureArray[4].getWeight(), 0.01);
    }

    @Test
    public void testFindIdenticalFurniture() {
        Furniture searchFurniture = new Furniture("Metal", new Dimensions(60, 40, 20), 15.0f, "Black", "Chair");

        boolean found = Arrays.asList(furnitureArray).contains(searchFurniture);
        assertTrue("The furniture object should be found.", found);
    }

    @Test
    public void testFindNonExistentFurniture() {
        Furniture searchFurniture = new Furniture("Leather", new Dimensions(50, 30, 20), 10.0f, "Brown", "Sofa");

        boolean found = Arrays.asList(furnitureArray).contains(searchFurniture);
        assertFalse("The furniture object should not be found.", found);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullDimensionsInFurniture() {
        new Furniture("Wood", null, 20.0f, "Brown", "Table");
    }
}
