public class Hogwarts {
    private String fullName;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String fullName, int magicPower, int transgressionDistance) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void compareHogwartsStudents(Hogwarts student2) {
        int student1Power = this.magicPower + this.transgressionDistance;
        int student2Power = student2.magicPower + transgressionDistance;
        if (student1Power > student2Power) {
            System.out.println(this.getFullName() + " обладает большей мощностью магии, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " обладает большей мощностью магии, чем " + this.getFullName());
        }
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}
