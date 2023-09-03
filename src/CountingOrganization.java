import java.util.HashMap;

public class CountingOrganization {

    private static CountingOrganization instance = null;

    private HashMap<String, Integer> populations;

    public static CountingOrganization getInstance() {
        if (instance == null) {
            instance = new CountingOrganization();
        }
        return instance;
    }


    private CountingOrganization() {
        this.populations = new HashMap<String, Integer>();
    }

    public void updateContinent(String continent, int population) {
        Integer current = this.populations.get(continent);
        if (current == null) {
            this.populations.put(continent, population);
        } else {
            this.populations.put(continent, this.populations.get(continent) + population);
        }
    }

    public int getContinentPopulation(String continent) {
       return this.populations.get(continent);
    }


}
