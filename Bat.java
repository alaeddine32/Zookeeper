public class Bat extends Mammal {

    public Bat() {
        this.energyLevel = 300;
    }

    public void fly() {
        System.out.println("Sound of a bat") ;
        this.energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Bat is eating a human") ;
        this.energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("The sound of a town on fire");
        this.energyLevel +=100;
    }
}