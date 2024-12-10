public class Animal {
    protected String species;
    protected String name;
    protected int nblegs;
    protected String color;

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

}
