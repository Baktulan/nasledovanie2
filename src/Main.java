
public class Main {
    public static void main(String[] args) {
        Programmer programmer= new Programmer("Baktulan","developer","Google");

        System.out.println(programmer);
        programmer.coding();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Dancer dancer= new Dancer("Akylai","dancer","Best Dancers");
        System.out.println(dancer);
        dancer.dancing();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Singer singer= new Singer("Asan","singer","Jigitter");
        System.out.println(singer);
        singer.bandName();


    }
}