package tourism.repository;

import org.springframework.stereotype.Repository;
import tourism.model.TouristAttraction;


import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private final List<TouristAttraction> attractions = new ArrayList<>();

    public TouristRepository() {
        populateAttractions();
    }

    private void populateAttractions() {
        attractions.add(new TouristAttraction("Grand Canyon", "A vast canyon with stunning rock formations."));
        attractions.add(new TouristAttraction("Eiffel Tower", "An iconic iron tower with panoramic city views."));
        attractions.add(new TouristAttraction("Taj Mahal", "A white marble mausoleum symbolizing eternal love."));
    }

    public List<TouristAttraction> getAttractions() {
        return attractions;
    }

    public TouristAttraction getAttractionByName(String name) {
        TouristAttraction current = null;
        for (TouristAttraction attraction : attractions) {
            if (attraction.getName().equals(name)) {
                current = attraction;
            }
        }
        return current;
    }

    public TouristAttraction addAttraction (TouristAttraction attraction) {
        attractions.add(attraction);
        return attraction;
    }


}

