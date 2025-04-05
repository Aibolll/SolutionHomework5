package flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightDemo {
    public static void main(String[] args) {
        List<MapMarker> markers = new ArrayList<>();

        // Create 1000 gas stations with same style
        for (int i = 0; i < 1000; i++) {
            markers.add(new MapMarker("GasStation_" + i, "Gas Icon", "Red"));
        }

        // Create 500 hospitals with same style
        for (int i = 0; i < 500; i++) {
            markers.add(new MapMarker("Hospital_" + i, "Hospital Icon", "Blue"));
        }

        // Render a few markers
        for (int i = 0; i < 5; i++) {
            markers.get(i).render();
        }

        System.out.println("Unique styles created: " + MarkerStyleFactory.getUniqueStylesCount());
        System.out.println("Total markers: " + markers.size());
    }
}
