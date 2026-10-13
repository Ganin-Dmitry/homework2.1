public class RavenclawStudents extends HogwartsStudents {

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public RavenclawStudents (String name, String surname, int value, int transgress, int mind, int wisdom, int wit, int creation) {
        super(name, surname, value, transgress);
        if (mind > 100) {
            this.setMind(100);
        } else if (mind < 0) {
            this.setMind(0);
        } else {
            this.setMind(mind);
        }
        if (wisdom > 100) {
            this.setWisdom(100);
        } else if (wisdom < 0) {
            this.setWisdom(0);
        } else {
            this.setWisdom(wisdom);
        }
        if (wit > 100) {
            this.setWit(100);
        } else if (wit < 0) {
            this.setWit(0);
        } else {
            this.setWit(wit);
        }
        if (creation > 100) {
            this.setCreation(100);
        } else if (creation < 0) {
            this.setCreation(0);
        } else {
            this.setCreation(creation);
        }
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
        if (mind > 100) {
            this.mind = 100;
        } else if (mind < 0) {
            this.mind = 0;
        } else {
            this.mind = mind;
        }
    }

    public void setWisdom (int wisdom) {
        if (wisdom > 100) {
            this.wisdom = 100;
        } else if (wisdom < 0) {
            this.wisdom = 0;
        } else {
            this.wisdom = wisdom;
        }
    }

    public void setWit (int wit) {
        if (wit > 100) {
            this.wit = 100;
        } else if (wit < 0) {
            this.wit = 0;
        } else {
            this.wit = wit;
        }
    }

    public void setCreation (int creation) {
        if (creation > 100) {
            this.creation = 100;
        } else if (creation < 0) {
            this.creation = 0;
        } else {
            this.creation = creation;
        }
    }

    @Override
    public String toString () {
        return super.toString() + "\nУм: " + this.getMind() + "\nМудрость: " + this.getWisdom() + "\nОстроумие: " + this.getWit() + "\nТворчество: " + this.getCreation();
    }

    public void equals (RavenclawStudents student) {
        int onePower = this.getMind() + this.getWisdom() + this.getWit() + this.getCreation();
        int twoPower = student.getMind() + student.getWisdom() + student.getWit() + this.getCreation();
        if (onePower > twoPower) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Когтевранец, чем " + student.getName() + " " + student.getSurname());
        } else if (twoPower > onePower) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Когтевранец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " и " + this.getName() + " " + this.getSurname() + " равны");
        }
    }
}
