public class Gryffindor extends Hogwarts {

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

    @Override
    public String toString () {
        return super.toString() + "\nБлагородство: " + this.getNobility() + "\nЧесть: " + this.getHonor() + "\nХрабрость: " +this.getBravery();
    }

    public void equals (Gryffindor student) {
        int onePower = this.getValue() + this.getTransgress() + this.getNobility() + this.getHonor() + this.getBravery();
        int twoPower = student.getValue() + student.getTransgress() + student.getNobility() + student.getHonor() + student.getBravery();
        if (onePower > twoPower) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Гриффиндоровец, чем " + student.getName() + " " + student.getSurname());
        } else if (twoPower > onePower) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Гриффиндоровец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " и " + this.getName() + " " + this.getSurname() + " равны");
        }
    }
}
