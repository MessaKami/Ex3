import java.util.Scanner;

public class Forme {
    private int x ;
    private int y ;

    public Forme(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Forme (Forme forme) {
        x = forme.x;
        y = forme.y;
    }

    public void creer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la valeur de x compris entre 0 et 800");
        int x = sc.nextInt();
        System.out.println("Entrez la valeur de y compris entre 0 et 800");
        int y = sc.nextInt();
    }

    public String afficher() {
        return "Forme [x=" + x + ", y=" + y + "]";
    }

    public void deplacer(int x , int y) {
        this.x = x;
        this.y = y;
    }

    public boolean verifier(Forme forme) {
        return forme.x == x && forme.y == y;
    }
}
