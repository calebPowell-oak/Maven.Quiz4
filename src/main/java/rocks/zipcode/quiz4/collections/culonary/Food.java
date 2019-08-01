package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    public List<Spice> spices = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> map = new HashMap<>();
        spices.stream().map(x -> (SpiceType) x.getClass()).forEach(x -> {
            if(map.containsKey(x)) map.replace(x, map.get(x) + 1);
            else map.put(x, 1);
        });
        return map;
    }

    private <T extends Class<? extends Spice>> String genericTest(T var){
        return var.getSimpleName();
    }

    public void applySpice(Spice spice) {
        this.spices.add(spice);
    }
}
