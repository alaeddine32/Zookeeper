public class BatTest {
    public static void main(String[] args) {

        Bat bat = new Bat() ;

        bat.getEnergyLevel();

        System.out.println("-----------------------\n");

        for (int i=0 ; i<3; i++) {
            bat.attackTown();
        }
        bat.getEnergyLevel();

        System.out.println("-----------------------\n");

        for (int i=0 ; i<2; i++) {
            bat.eatHumans();
        }
        bat.getEnergyLevel();

        System.out.println("-----------------------\n");

        for (int i=0 ; i<2; i++) {
            bat.fly();
        }
        bat.getEnergyLevel();
    }

}