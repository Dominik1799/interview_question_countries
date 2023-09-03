
public class Main {
    public static void main(String[] args) {
        Country a = new Country("Slovakia", "Europe", 100);
        Country b = new Country("Poland", "Europe", 200);
        Country c = new Country("Ukraine", "Europe", 250);
        Country d = new Country("USA", "North America", 500);
        Country e = new Country("China", "Asia", 1000);

        System.out.print(CountingOrganization.getInstance().getContinentPopulation("Asia"));
    }
}