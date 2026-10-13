public class GryffindorStudents extends HogwartsStudents {

    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudents (String name, String surname, int value, int transgress, int nobility, int honor, int bravery) {
        super(name, surname, value, transgress);
        if (nobility > 100) {
            this.setNobility(100);
        } else if (nobility < 0) {
            this.setNobility(0);
        } else {
            this.setNobility(nobility);
        }
        if (honor > 100) {
            this.setHonor(100);
        } else if (honor < 0) {
            this.setHonor(0);
        } else {
            this.setHonor(honor);
        }
        if (bravery > 100) {
            this.setBravery(100);
        } else if (bravery < 0) {
            this.setBravery(0);
        } else {
            this.setBravery(bravery);
        }
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
        if (nobility > 100) {
            this.nobility = 100;
        } else if (nobility < 0) {
            this.nobility = 0;
        } else {
            this.nobility = nobility;
        }
    }

    public void setHonor(int honor) {
        if (honor > 100) {
            this.honor = 100;
        } else if (honor < 0) {
            this.honor = 0;
        } else {
            this.honor = honor;
        }
    }

    public void setBravery(int bravery) {
        if (bravery > 100) {
            this.bravery = 100;
        } else if (bravery < 0) {
            this.bravery = 0;
        } else {
            this.bravery = bravery;
        }
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
