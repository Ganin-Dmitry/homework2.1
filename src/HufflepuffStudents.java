public class HufflepuffStudents extends HogwartsStudents {

    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudents (String name, String surname, int value, int transgress, int diligence, int loyalty, int honesty) {
        super(name, surname, value, transgress);
        this.setDiligence(diligence);
        this.setLoyalty(loyalty);
        this.setHonesty(honesty);
    }

    public int getDiligence () {
        return this.diligence;
    }

    public int getLoyalty () {
        return this.loyalty;
    }

    public int getHonesty () {
        return this.honesty;
    }

    public void setDiligence (int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty (int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty (int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString () {
        return super.toString() + "\nТрудолюбие: " + this.getDiligence() + "\nВерность: " + this.getLoyalty() + "\nЧестность: " + this.getHonesty();
    }

    public void equals (HufflepuffStudents student) {
        int onePower = this.getDiligence() + this.getLoyalty() + this.getHonesty();
        int twoPower = student.getDiligence() + student.getLoyalty() + student.getHonesty();
        if (onePower > twoPower) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший студент Пуффендуя, чем " + student.getName() + " " + student.getSurname());
        } else if (twoPower > onePower) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший студент Пуффендуя, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " и " + this.getName() + " " + this.getSurname() + " равны");
        }
    }
}
