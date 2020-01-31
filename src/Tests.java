import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void test() {
        SwBuilders printer = new ThreeDPrinter();
        createHouses(printer);

        SwBuilders worker = new Worker();
        createHouses(worker);
    }

    public void createHouses(SwBuilders factory) {
        assertNotNull(factory);

        House house1 = factory.createHouse();
        assertNotNull(house1);

        Store store1 = factory.createStore();
        assertNotNull(store1);
    }
}