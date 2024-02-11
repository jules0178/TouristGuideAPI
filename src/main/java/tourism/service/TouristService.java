// TouristService.java
package tourism.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourism.model.TouristAttraction;
import tourism.repository.TouristRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TouristService {

   @Autowired
    private TouristRepository touristRepository;

    public List<TouristAttraction> getAttractions() {
        return touristRepository.getAttraction();
    }

    public void addAttraction(TouristAttraction attraction) {
        touristRepository.addAttraction(attraction);
    }

    public void deleteAttraction(String name) {
        touristRepository.deleteAttraction(name);
    }

}
