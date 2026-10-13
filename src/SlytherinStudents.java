public class SlytherinStudents extends HogwartsStudents {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudents (String name, String surname, int value, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, value, transgress);
        if (cunning > 100) {
            this.setCunning(100);
        } else if (cunning < 0) {
            this.setCunning(0);
        } else {
            this.setCunning(cunning);
        }
        if (determination > 100) {
            this.setDetermination(100);
        } else if (determination < 0) {
            this.setDetermination(0);
        } else {
            this.setDetermination(determination);
        }
        if (ambition > 100) {
            this.setAmbition(100);
        } else if (ambition < 0) {
            this.setAmbition(0);
        } else {
            this.setAmbition(ambition);
        }
        if (resourcefulness > 100) {
            this.setResourcefulness(100);
        } else if (resourcefulness < 0) {
            this.setResourcefulness(0);
        } else {
            this.setResourcefulness(resourcefulness);
        }
        if (lustForPower > 100) {
            this.setLustForPower(100);
        } else if (lustForPower < 0) {
            this.setLustForPower(0);
        } else {
            this.setLustForPower(lustForPower);
        }
    }

    public int getCunning() {
        return this.cunning;
    }

    public int getDetermination() {
        return this.determination;
    }

    public int getAmbition() {
        return this.ambition;
    }

    public int getResourcefulness() {
        return this.resourcefulness;
    }

    public int getLustForPower() {
        return this.lustForPower;
    }

    public void setCunning(int cunning) {
        if (cunning > 100) {
            this.cunning = 100;
        } else if (cunning < 0) {
            this.cunning = 0;
        } else {
            this.cunning = cunning;
        }
    }

    public void setDetermination(int determination) {
        if (determination > 100) {
            this.determination = 100;
        } else if (determination < 0) {
            this.determination = 0;
        } else {
            this.determination = determination;
        }
    }

    public void setAmbition(int ambition) {
        if (ambition > 100) {
            this.ambition = 100;
        } else if (ambition < 0) {
            this.ambition = 0;
        } else {
            this.ambition = ambition;
        }
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness > 100) {
            this.resourcefulness = 100;
        } else if (resourcefulness < 0) {
            this.resourcefulness = 0;
        } else {
            this.resourcefulness = resourcefulness;
        }
    }

    public void setLustForPower(int lustForPower) {
        if (lustForPower > 100) {
            this.lustForPower = 100;
        } else if (lustForPower < 0) {
            this.lustForPower = 0;
        } else {
            this.lustForPower = lustForPower;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nХитрость: " + this.getCunning() + "\nРешительность: " + this.getDetermination() + "\nАмбициозность: " + this.getAmbition() + "\nНаходчивость: " + this.getResourcefulness() + "\nЖажда власти: " + this.getLustForPower();
    }

    public void equals(SlytherinStudents student) {
        int onePower = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int twoPower = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();
        if (onePower > twoPower) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший ученик Слизерина, чем " + student.getName() + " " + student.getSurname());
        } else if (twoPower > onePower) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший ученик Слизерина, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " и " + this.getName() + " " + this.getSurname() + " равны");
        }
    }
}