public class Hogwarts {

    private String name;
    private String surname;
    private int value;
    private int transgress;

    public Hogwarts (String name, String surname, int value, int transgress) {
        this.name = name;
        this.surname = surname;
        this.value = value;
        this.transgress = transgress;
    }

    public String getName () {
        return  this.name;
    }

    public String getSurname () {
        return this.surname;
    }

    public int getValue () {
        return this.value;
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

    public void setValue (int value) {
        this.value = value;
    }

    public void setTransgress (int transgress) {
        this.transgress = transgress;
    }

    @Override
    public String toString () {
        return "Имя: " + this.getName() + " " + this.getSurname() + "\nСила магии: " + this.getValue() + "\nРастояние трансгрессии: " + this.getTransgress();
    }

    public void equals (Hogwarts student) {
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