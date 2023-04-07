package nl.corne;

public class Android extends Human implements Chargeable {

    private int level = 40;

    @Override
    public String greet() {
        return "I'm only half human, but human still.... my energy level is " + this.getLevel() + "%";
    }

    @Override
    public int charge(int amount) {
        if (this.level + amount > 100) {
            System.out.println("charge action rejected");
            return getLevel();
        }
        this.level += amount;
        return getLevel();
    }

    public int getLevel() {
        return level;
    }

}
