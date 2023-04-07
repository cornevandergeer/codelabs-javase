public class Bier {

    private String naam;
    private double alcoholPercentage;
    private byte volume;

    private Krat krat;

    // constructor (no args constructor)
    public Bier() {

    }

    // all args construtor
    public Bier(String naam, double alc, byte volume) {
        this.naam = naam;
        this.alcoholPercentage = alc;
        this.volume = volume;
    }

    // custom methods

    public void neemSlok() {
        this.volume -= (byte) 10;
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof Bier b) {
            byte volume = b.volume;
            double alcoholPercentage = b.alcoholPercentage;
            String naam = b.naam;
            if (this.volume == volume &&
                    this.alcoholPercentage == alcoholPercentage &&
                    this.naam.equals(naam)) ;
            {
                return true;
            }
        }
        return false;
    }

    // setters
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public void setVolume(byte volume) {
        this.volume = volume;
    }

    public void setKrat(Krat krat) {
        this.krat = krat;
    }

    //getters

    public String getNaam() {
        return naam;
    }

    public byte getVolume() {
        return volume;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }
}




