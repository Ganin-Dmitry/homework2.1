public class Ravenclaw extends Student {

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw (String name, String surname, int value, int transgress, int mind, int wisdom, int wit, int creation) {
        super(name, surname, value, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind () {
        return this.mind;
    }

    public int getWisdom () {
        return this.wisdom;
    }

    public int getWit () {
        return this.wit;
    }

    public int getCreation () {
        return this.creation;
    }

    public void setMind (int mind) {
        this.mind = mind;
    }

    public void setWisdom (int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit (int wit) {
        this.wit = wit;
    }

    public void setCreation (int creation) {
        this.creation = creation;
    }
}
