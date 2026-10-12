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


}