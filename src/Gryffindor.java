public class Gryffindor extends Student {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor (String name, String surname, int value, int transgress, int nobility, int honor, int bravery) {
        super(name, surname, value, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public int getNobility() {
        return this.nobility;
    }

    public int getHonor() {
        return this.honor;
    }

    public int getBravery() {
        return this.bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
