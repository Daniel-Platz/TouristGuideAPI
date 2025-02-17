package org.example.touristguideapi.repository;

import org.example.touristguideapi.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private List<TouristAttraction> touristAttractions;

    public TouristRepository() {
        touristAttractions = new ArrayList<>();
        addAttractions();
    }

    public void addAttractions() {

        TouristAttraction touristAttraction1 = new TouristAttraction("Attraction1", "Deacription of Attraction1");
        TouristAttraction touristAttraction2 = new TouristAttraction("Attraction2", "Deacription of Attraction2");

        touristAttractions.add(touristAttraction1);
        touristAttractions.add(touristAttraction2);


    }

    public List<TouristAttraction> getAllAttractions() {
        return touristAttractions;
    }

    public TouristAttraction findAttractionByName(String name) {
        TouristAttraction temp = null;
        for (TouristAttraction attraction : touristAttractions) {
            if (name.equalsIgnoreCase(attraction.getName())) {
                temp = attraction;
            }
        }

        return temp;
    }

    public TouristAttraction addAttraction(TouristAttraction touristAttraction) {

        touristAttractions.add(touristAttraction);
        return touristAttraction;
    }

    public TouristAttraction updateAttraction(TouristAttraction updatedAttraction) {
        for (int i = 0; i < touristAttractions.size(); i++) {
            if (updatedAttraction.getName().equals(touristAttractions.get(i).getName())) {
                touristAttractions.set(i, updatedAttraction);
            }
        }
        return updatedAttraction;
    }

    public TouristAttraction deleteAttraction(String name) {
        for (TouristAttraction attraction : touristAttractions) {
            if (attraction.getName().equalsIgnoreCase(name)) {
                touristAttractions.remove(attraction);
                return attraction;
            }
        }
        return null;
    }

    // Klassen skal desuden indeholde CRUD metoder, der arbejder på ovenstående
    // ArrayList. Vent evt. med den endelige metodesignatur for CRUD metoderne til I
    // har set beskrivelsen af Controller klassens endpoints nedenfor.


}
