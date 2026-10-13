public class GryffindorStudents extends HogwartsStudents {

    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudents (String name, String surname, int value, int transgress, int nobility, int honor, int bravery) {
        super(name, surname, value, transgress);
        this.setNobility(nobility);
        this.setHonor(honor);
        this.setBravery(bravery);

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

    public void equals (GryffindorStudents student) {
        int onePower = this.getNobility() + this.getHonor() + this.getBravery();
        int twoPower = student.getNobility() + student.getHonor() + student.getBravery();
        if (onePower > twoPower) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Гриффиндоровец, чем " + student.getName() + " " + student.getSurname());
        } else if (twoPower > onePower) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Гриффиндоровец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " и " + this.getName() + " " + this.getSurname() + " равны");
        }
    }
}
