public class Slytherin extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin (String name, String surname, int value, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, value, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning () {
        return this.cunning;
    }

    public int getDetermination () {
        return this.determination;
    }

    public int getAmbition() {
        return this.ambition;
    }

    public int getResourcefulness () {
        return this.resourcefulness;
    }

    public int getLustForPower() {
        return this.lustForPower;
    }

    public void setCunning (int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination (int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
