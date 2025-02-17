package org.example.touristguideapi.controller;

import org.example.touristguideapi.model.TouristAttraction;
import org.example.touristguideapi.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {

    private final TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @GetMapping("")
    public ResponseEntity<List<TouristAttraction>> getAllAttractions(){
        List<TouristAttraction> touristAttractions = touristService.getAllAttractions();
        return new ResponseEntity<>(touristAttractions, HttpStatus.OK);

    }
    @GetMapping("/{name}")
    public ResponseEntity<TouristAttraction> getAttractionByName(@PathVariable String name){
        TouristAttraction attraction = touristService.findAttractionByName(name);
        return new ResponseEntity<>(attraction, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<TouristAttraction> addAttraction(@RequestBody TouristAttraction touristAttraction){
        TouristAttraction newTouristAttraction = touristService.addAttraction(touristAttraction);
        return new ResponseEntity<>(newTouristAttraction, HttpStatus.CREATED);

    }

    @PostMapping("update/{name}")
    public ResponseEntity<TouristAttraction> updateAttraction(@RequestBody TouristAttraction attraction) {
        TouristAttraction updateAttraction = touristService.updateAttraction(attraction);
        return new ResponseEntity<>(updateAttraction, HttpStatus.OK);
    }
    @PostMapping("/delete/{name}")
    public ResponseEntity<TouristAttraction> deleteAttraction(@PathVariable String name) {
        TouristAttraction deleteAttraction = touristService.deleteAttraction(name);
        return new ResponseEntity<>(deleteAttraction, HttpStatus.OK);
    }











    //Lav nedenstående CRUD endpoints med funktionalitet, der alle returnerer et
    //ResponseEntity.



}
