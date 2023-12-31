public class Country {
    String name;
    String continent;
    int population;

    public Country(String name, String continent, int population) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        CountingOrganization.getInstance().updateContinent(this.continent, this.population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
