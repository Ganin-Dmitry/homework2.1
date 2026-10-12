public class Ravenclaw extends Hogwarts {

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

    @Override
    public String toString () {
        return super.toString() + "\nУм: " + this.getMind() + "\nМудрость: " + this.getWisdom() + "\nОстроумие: " + this.getWit() + "\nТворчество: " + this.getCreation();
    }

    public void equals (Ravenclaw student) {
        int onePower = this.getValue() + this.getTransgress() + this.getMind() + this.getWisdom() + this.getWit() + this.getCreation();
        int twoPower = student.getValue() + student.getTransgress() + student.getMind() + student.getWisdom() + student.getWit() + this.getCreation();
        if (onePower > twoPower) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Когтевранец, чем " + student.getName() + " " + student.getSurname());
        } else if (twoPower > onePower) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Когтевранец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " и " + this.getName() + " " + this.getSurname() + " равны");
        }
    }
}
