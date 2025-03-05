public class Bebek implements Hewan {
    @Override
    public void jenis(){
        System.out.println("Bebek");
    }
    @Override
    public void bersuara() {
        System.out.println("Kwek.. Kwek..");
    }

    @Override
    public void bergerak() {
        System.out.println("Berenang");
    }
}
