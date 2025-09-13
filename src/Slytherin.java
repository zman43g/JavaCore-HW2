public class Slytherin extends Hogwarts {
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int ingenuity;
    private int lustForPower;

    public Slytherin(String fullName, int magicPower, int transgressionDistance, int cunning, int decisiveness, int ambition, int ingenuity, int lustForPower) {
        super(fullName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.lustForPower = lustForPower;
    }

    public void printInfo() {
        System.out.println(getFullName() + ": сила магии " + getMagicPower() +
                ", расстояние трансгрессии " + getTransgressionDistance() +
                ", хитрость " + cunning + ", решительность " + decisiveness + ", амбициозность " + ambition +
                ", находчивость " + ingenuity + ", жажда власти " + lustForPower);
    }

    public void compareStudents(Slytherin student2) {
        int student1Power = this.cunning + this.decisiveness + this.ambition + this.ingenuity + this.lustForPower;
        int student2Power = student2.cunning + student2.decisiveness + student2.ambition + student2.ingenuity + student2.lustForPower;
        if (student1Power > student2Power) {
            System.out.println(this.getFullName() + " лучший слизеринец, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший слизеринец, чем " + this.getFullName());
        }
    }
}
