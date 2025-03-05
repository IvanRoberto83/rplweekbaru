public class Burung implements Hewan{
    @Override
    public void jenis(){
        System.out.println("Burung");
    }
    @Override
    public void bersuara() {
        System.out.println("Kur.. Kurr..");
    }

    @Override
    public void bergerak() {
        System.out.println("Terbang");
    }
}
