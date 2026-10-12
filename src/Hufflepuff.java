public class Hufflepuff extends Hogwarts{

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff (String name, String surname, int value, int transgress, int diligence, int loyalty, int honesty) {
        super(name, surname, value, transgress);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence () {
        return this.diligence;
    }

    public int getLoyalty () {
        return this.loyalty;
    }

    public int getHonesty () {
        return this.honesty;
    }

    public void setDiligence (int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty (int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty (int honesty) {
        this.honesty = honesty;
    }
}
