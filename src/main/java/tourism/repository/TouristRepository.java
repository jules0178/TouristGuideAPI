package tourism.repository;

import org.springframework.stereotype.Repository;
import tourism.model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    List<TouristAttraction> attractions = new ArrayList<>();
    public TouristRepository() {
        TouristAttraction attraction1 = new TouristAttraction("Tivoli", "En forlystelsespark");
        attractions.add(attraction1);
        TouristAttraction attraction2 = new TouristAttraction("Lalandia", "Et feriested med vandland");
        attractions.add(attraction2);
    }
    public List<TouristAttraction> getAttraction() {
        return attractions;
    }

    public void addAttraction(TouristAttraction attraction) {
        attractions.add(attraction);
    }


    public void deleteAttraction(String name) {
        attractions.removeIf(attraction -> attraction.getName().equals(name));
    }

}
