public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int value, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, value, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return this.cunning;
    }

    public int getDetermination() {
        return this.determination;
    }

    public int getAmbition() {
        return this.ambition;
    }

    public int getResourcefulness() {
        return this.resourcefulness;
    }

    public int getLustForPower() {
        return this.lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
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

    @Override
    public String toString() {
        return super.toString() + "\nХитрость: " + this.getCunning() + "\nРешительность: " + this.getDetermination() + "\nАмбициозность: " + this.getAmbition() + "\nНаходчивость: " + this.getResourcefulness() + "\nЖажда власти: " + this.getLustForPower();
    }

    public void equals(Slytherin student) {
        int onePower = this.getValue() + this.getTransgress() + this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int twoPower = student.getValue() + student.getTransgress() + student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();
        if (onePower > twoPower) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший ученик Слизерина, чем " + student.getName() + " " + student.getSurname());
        } else if (twoPower > onePower) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший ученик Слизерина, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " и " + this.getName() + " " + this.getSurname() + " равны");
        }
    }
}