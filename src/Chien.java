public class Chien extends Animal {

    public String race;

    public Chien(String name, String race, String color) {
        super("Caniné", name, 4, color);
        this.race = race;
    }

    public Chien(Chien chien) {
        super(chien);
        race = chien.race;
    }

    @Override
    public String getCryAnimal() {
        return "Wouf wouf";
    }

    public String getAboyer() {
        return "Bark Bark !";
    }

    @Override
    public String toString() {
        return String.format("C'est un %s sa race est un %s, son pelage est de couleur %s et il a %s pattes le chien fait %s", getSpecies(), race, getColor(), 4, getAboyer())  + " C'est un chien";
    }
}
