package tourism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tourism.service.TouristService;

@RestController
@RequestMapping("attractions")
public class TouristController {

    private TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }
}
