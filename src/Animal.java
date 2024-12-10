public class Animal {
    private String species;
    private String name;
    private int nblegs;
    private String color;

    public Animal(String species, String name, int nblegs, String color) {
        this.species = species;
        this.name = name;
        this.nblegs = nblegs;
        this.color = color;
    }

    public Animal(Animal animal) {
        species = animal.species;
        name = animal.name;
        nblegs = animal.nblegs;
        color = animal.color;
    }

    public String getCryAnimal() {
        return "";
    }

    public String toString() {
        return "C'est un animal";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNblegs() {
        return nblegs;
    }

    public void setNblegs(int nblegs) {
        this.nblegs = nblegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
