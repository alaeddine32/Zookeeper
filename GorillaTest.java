public class GorillaTest {
    public static void main(String[] args) {

        Gorilla gorilla = new Gorilla() ;
        gorilla.getEnergyLevel();

        System.out.println("-----------------------\n");

        for (int i=0 ; i<3; i++) {
            gorilla.throwSomething();
        }
        gorilla.getEnergyLevel();

        System.out.println("-----------------------\n");

        for (int i=0 ; i<2; i++) {
            gorilla.eatBananas();
        }
        gorilla.getEnergyLevel();

        System.out.println("-----------------------\n");

        gorilla.climb() ;
        gorilla.getEnergyLevel();

        System.out.println("-----------------------\n");
    }
}