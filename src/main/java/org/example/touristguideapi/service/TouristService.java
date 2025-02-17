package org.example.touristguideapi.service;

import org.example.touristguideapi.model.TouristAttraction;
import org.example.touristguideapi.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {

    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<TouristAttraction> getAllAttractions(){
        return touristRepository.getAllAttractions();

    }

    public TouristAttraction findAttractionByName(String name){
        TouristAttraction touristAttraction = touristRepository.findAttractionByName(name);
     return touristAttraction;
    }


    public TouristAttraction addAttraction(TouristAttraction touristAttraction){
        return touristRepository.addAttraction(touristAttraction);
    }

    public TouristAttraction updateAttraction (TouristAttraction attraction){
        return touristRepository.updateAttraction(attraction);
    }

    public TouristAttraction deleteAttraction (String name) {
        return touristRepository.deleteAttraction(name);
    }

}
