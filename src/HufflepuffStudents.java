public class HufflepuffStudents extends HogwartsStudents {

    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudents (String name, String surname, int value, int transgress, int diligence, int loyalty, int honesty) {
        super(name, surname, value, transgress);
        if (diligence > 100) {
            this.setDiligence(100);
        } else if (diligence < 0) {
            this.setDiligence(0);
        } else {
            this.setDiligence(diligence);
        }
        if (loyalty > 100) {
            this.setLoyalty(100);
        } else if (loyalty < 0) {
            this.setLoyalty(0);
        } else {
            this.setLoyalty(loyalty);
        }
        if (honesty > 100) {
            this.setHonesty(100);
        } else if (honesty < 0) {
            this.setHonesty(0);
        } else {
            this.setHonesty(honesty);
        }
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
        if (diligence > 100) {
            this.diligence = 100;
        } else if (diligence < 0) {
            this.diligence = 0;
        } else {
            this.diligence = diligence;
        }
    }

    public void setLoyalty (int loyalty) {
        if (loyalty > 100) {
            this.loyalty = 100;
        } else if (loyalty < 0) {
            this.loyalty = 0;
        } else {
            this.loyalty = loyalty;
        }
    }

    public void setHonesty (int honesty) {
        if (honesty > 100) {
            this.honesty = 100;
        } else if (honesty < 0) {
            this.honesty = 0;
        } else {
            this.honesty = honesty;
        }
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
