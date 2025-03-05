public class Main {
    public static void main(String[] args) {
        Hewan bebek = new Bebek();
        bebek.jenis();
        bebek.bersuara();
        bebek.bergerak();

        System.out.println();

        Hewan burung = new Burung();
        burung.jenis();
        burung.bersuara();
        burung.bergerak();
    }
}
