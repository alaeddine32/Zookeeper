public class Mammal {
    protected int energyLevel ;

    public Mammal() {
        this.energyLevel = 100 ;
    }
    public int getEnergyLevel() {
        System.out.println("Mamal Energy Level : "+this.energyLevel);
        return this.energyLevel;
    }
}