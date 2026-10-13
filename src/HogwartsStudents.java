public abstract class HogwartsStudents {

    private String name;
    private String surname;
    private int mind;
    private int transgress;

    public HogwartsStudents (String name, String surname, int mind, int transgress) {
        this.setName(name);
        this.setSurname(surname);
        if (mind > 100) {
            this.setValue(100);
        } else if (mind < 0) {
            this.setValue(0);
        } else {
            this.setValue(mind);
        }
        if (transgress > 100) {
            this.setTransgress(100);
        } else if (transgress < 0) {
            this.setTransgress(0);
        } else {
            this.setTransgress(transgress);
        }
    }

    public String getName () {
        return  this.name;
    }

    public String getSurname () {
        return this.surname;
    }

    public int getValue () {
        return this.mind;
    }

    public int getTransgress () {
        return this.transgress;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public void setValue (int mind) {
        if (mind > 100) {
            this.mind = 100;
        } else if (mind < 0) {
            this.mind = 0;
        } else {
            this.mind = mind;
        }
    }

    public void setTransgress (int transgress) {
        if (transgress > 100) {
            this.transgress = 100;
        } else if (transgress < 0) {
            this.transgress = 0;
        } else {
            this.transgress = transgress;
        }
    }

    @Override
    public String toString () {
        return "Имя: " + this.getName() + " " + this.getSurname() + "\nСила магии: " + this.getValue() + "\nРастояние трансгрессии: " + this.getTransgress();
    }

    public void equals (HogwartsStudents student) {
        int onePower = this.getValue() + this.getTransgress();
        int twoPower = student.getValue() + student.getTransgress();
        if (onePower > twoPower) {
            System.out.println(this.getName() + " " + this.getSurname() + " обладает большей мощностью магии, чем " + student.getName() + " " + student.getSurname());
        } else if (twoPower > onePower) {
            System.out.println(student.getName() + " " + student.getSurname() + " обладает большей мощностью магии, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " и " + this.getName() + " " + this.getSurname() + " равны по силе");
        }
    }
}