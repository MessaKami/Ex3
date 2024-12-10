public class Chat extends Animal {

    private String mustach;

    public Chat(String name,String color, String mustach) {
        super("Félin", name, 4, color);
        this.mustach = mustach;
    }

    public Chat(Chat chat) {
        super(chat);
        mustach = chat.mustach;
    }

    @Override
    public String getCryAnimal() {
        return "Miaou miaou";
    }

    @Override
    public String toString() {
        return String.format("C'est un %s il a une %S moustache, son pelage est de couleur %s et il a %s pattes", species, mustach, color, 4)  + " C'est un chat";
    }
}
